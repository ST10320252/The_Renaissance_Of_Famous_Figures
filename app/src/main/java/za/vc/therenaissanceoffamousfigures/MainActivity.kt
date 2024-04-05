@file:Suppress("UNUSED_EXPRESSION", "DUPLICATE_LABEL_IN_WHEN")

package za.vc.therenaissanceoffamousfigures

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private lateinit var compareButton: Button
    private lateinit var clearButton: Button
    private lateinit var ageEditText: EditText
    private lateinit var resultTextView: TextView

    @SuppressLint("SetTextI18n", "CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        compareButton = findViewById(R.id.clearButton)
        clearButton = findViewById(R.id.clearButton)
        ageEditText = findViewById(R.id.ageEditText)
        resultTextView = findViewById(R.id.resultTextView)


        compareButton.setOnClickListener {
            val userInput = ageEditText.text.toString()
            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age - it must be a whole number without any decimals or text."
            } else {
                val userAge = userInput.toIntOrNull()
                if (userAge == null) {
                    resultTextView.text = "Please enter a valid age - it must be a whole number without any decimals or text."
                    return@setOnClickListener
                }
                if (userAge < 20 || userAge > 100) {
                    resultTextView.text = "Please enter an age between 20 and 100."
                    ageEditText.text.clear()
                } else {
                    when (userAge) {
                        in 20..64 -> "Adult"
                        in 65..100 -> "Senior"
                        else -> {
                            when (userAge) {
                                56 -> "Abraham Lincoln, known for leading the nation through the Civil War and abolishing slavery, died at this age."
                                67 -> "Leonardo da Vinci, known for his diverse talents as a painter, inventor, and polymath during the Renaissance, died at this age."
                                67 -> "George Washington, known for being the founding father of the United States and the country's first president, died at this age."
                                39 -> "Martin Luther King Jr, known for his advocacy of nonviolent resistance and fight against racial injustice, died at this age."
                                39 -> "Cleopatra, known for intelligence, beauty, and political prowess, died at this age."
                                76 -> "Albert Einstein, known for developing the theory of relativity and significant contributions made to modern physics, died at this age."
                                88 -> "Michelangelo, known for his masterpieces in sculpture, painting and architecture, died at this age."
                                27 -> "Henry Moseley, known for discovering the relationship between atomic number and x-ray spectra, revolutionizing atomic physics, died at this age."
                                37 -> "Vincent Van Gogh, known for his vivid use of color and emotional expression in his artworks, died at this age."
                                36 -> "Princess Diana, known for her charitable work and compassionate nature, died at this age."
                                else -> "Nobody known to me died at this age"
                            }
                            val result = null
                            resultTextView.text = result
                        }
                    }
                }

                clearButton.setOnClickListener {
                    ageEditText.text.clear()
                    resultTextView.text = ""
                }
            }
        }
    }
}



