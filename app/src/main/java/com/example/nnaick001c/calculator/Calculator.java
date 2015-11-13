package com.example.nnaick001c.calculator;
//Hell
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.app.AlertDialog;
import android.widget.TextView;
import android.util.Log;

public class Calculator extends AppCompatActivity  {
    private static final int ROWS=3;
    private static final int COLS=3;
    private static int number=0;
    private static float tempResult=0;
    private static String operator="";
    private static float resultValue=0;
    private static double result=0;

   EditText editText;
    TextView topOpp;
    TextView tep ;
    TextView res;
    TextView opp;
    boolean flag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityInfo r;

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText=(EditText) findViewById(R.id.editResult);
        topOpp=(TextView) findViewById(R.id.editOperations);
        tep=(TextView) findViewById(R.id.tepValue);
        res=(TextView) findViewById(R.id.resValue);
        opp=(TextView) findViewById(R.id.oppValue);
        final Button zero=(Button)findViewById(R.id.zeroButton);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) zero.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());


            }
        });
        final Button dot=(Button) findViewById(R.id.dotButton);
        final Button del=(Button) findViewById(R.id.dellButton);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enterValue = editText.getText().toString();
                if(enterValue.length()>0) {
                    editText.setText(enterValue.substring(0, enterValue.length() - 1));
                    editText.setSelection(editText.getText().length());
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) dot.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                editText.setText("");
            }
        });
        //numberButtonGeneration();
        OnClickNumberButton();
        operatorButton();

    }

    private void OnClickNumberButton()
    {
        final Button one =(Button) findViewById(R.id.oneButton);
        final Button two =(Button) findViewById(R.id.twoButton);
        final Button three =(Button) findViewById(R.id.threeButton);
        final Button four =(Button) findViewById(R.id.fourButton);
        final Button five =(Button) findViewById(R.id.fiveButton);
        final  Button six =(Button) findViewById(R.id.sixButton);
        final Button seven =(Button) findViewById(R.id.sevenButton);
        final Button eight =(Button) findViewById(R.id.eightButton);
        final  Button nine =(Button) findViewById(R.id.nineButton);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) one.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) two.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) three.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) four.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) five.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) six.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) seven.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) eight.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enterValue = editText.getText() + (String) nine.getText();
                editText.setText(enterValue);
                editText.setTextColor(Color.parseColor("blue"));
                editText.setSelection(editText.getText().length());
            }
        });


    }


    private void operatorButton()
    {
        Button add=(Button)findViewById(R.id.plusButton);
        Button equal=(Button) findViewById(R.id.equalButton);
        Button minus =(Button) findViewById(R.id.minusButton);
        Button multi =(Button) findViewById(R.id.multiplyButton);
        Button div =(Button) findViewById(R.id.divisionButton);
        Button pow =(Button) findViewById(R.id.capButton);
        Button remin =(Button) findViewById(R.id.modlButton);
        Button clr=(Button) findViewById(R.id.clearButton);




        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                //editText.setHint("0");
                editText.setSelection(editText.getText().length());
                setTempValues();
                setValues();
            }
        });

        remin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "%";
                if (readValue()) {
                    editText.setText("");

                    setValues();
                    if(tempResult!=0&&resultValue!=0) {
                        editText.setText(Float.toString(tempResult % resultValue));
                        editText.setSelection(editText.getText().length());
                        setValues(); //setTempValues();
                       // tempResult=0;resultValue=0;operator="";

                    }
                    }
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "^";
                if (readValue()) {
                    editText.setText("");
                    setValues();
                    if(tempResult!=0&&resultValue!=0)
                    {
                        Float temp=new Float(tempResult)  ;
                       double a= temp.doubleValue();
                        Float temp1=new Float(resultValue);
                        double b=temp1.doubleValue();
                        editText.setText(Double.toString(Math.pow(a, b)));
                        editText.setSelection(editText.getText().length());
                        setValues(); //setTempValues();
                        //tempResult=0;resultValue=0;operator="";

                    }
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                if (readValue()) {
                    editText.setText("");
                    setValues();
                    if(tempResult!=0&&resultValue!=0)
                    {
                        editText.setText(Float.toString(tempResult / resultValue));
                        editText.setSelection(editText.getText().length());
                        //tempResult=0;resultValue=0;operator="";
                        setValues();//setTempValues();
                    }
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                operator = "*";
                if (readValue()) {
                    editText.setText("");
                    setValues();
                    if(tempResult!=0&&resultValue!=0)
                    {
                        editText.setText(Float.toString(tempResult * resultValue));
                        editText.setSelection(editText.getText().length());
                        //tempResult=0;resultValue=0;operator="";
                        setValues(); //setTempValues();
                    }
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                if (readValue()) {
                    editText.setText("");
                    setValues();
                    if (tempResult != 0 && resultValue != 0) {
                        editText.setText(Float.toString(tempResult - resultValue));
                        editText.setSelection(editText.getText().length());
                        setValues();//setTempValues();

                    }
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                if (readValue()) {
                    editText.setText("");
                    setValues();
                    if (tempResult != 0 && resultValue != 0) {
                        editText.setText(Float.toString(tempResult + resultValue));
                        editText.setSelection(editText.getText().length());
                        setValues();
                        //setTempValues();
                    }
                }

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (readValue()) {
                    System.out.println("Value is : "+operationValue());
                    Log.d("OperatedValue",tempResult+" "+operator+" "+resultValue+" = "+result);

                    editText.setText(Double.toString(result));
                    editText.setSelection(editText.getText().length());

                    setTempValues();
                }
            }
        });


    }
    public boolean readValue()
    {
        String message="";
        setValues();
        try {
            if ((editText.getText().toString().matches(""))) {
                if(tempResult==0) {
                    message = "Please enter first number";
                    Calculator.this.showPopupMessage(message);
                    return false;

                }
                else if (operator.matches("")) {
                    message = "Please select Operator";
                    Calculator.this.showPopupMessage(message);
                    return false;
                }
                else if (!operator.matches("")&&tempResult!=0){
                    message = "Please enter second number";
                    Calculator.this.showPopupMessage(message);
                    return false;

                }else  if(operator.matches("")&&tempResult!=0){
                    message = "Please enter second number & operator";
                    Calculator.this.showPopupMessage(message);
                    return false;
                }

            } else {
                if(tempResult==0) {
                    tempResult = Float.parseFloat(editText.getText().toString());
                    editText.setText("");
                    setValues();

                    return true;
                }
                else if (tempResult!=0 && !operator.matches("") && resultValue==0) {

                    resultValue = Float.parseFloat(editText.getText().toString());
                    editText.setText("");
                    operationValue();
                    setValues();

                }
                else if(operator.matches("")&&tempResult!=0){
                    message = "Please enter second number & operator";
                    Calculator.this.showPopupMessage(message);
                    return false;
                }

            }
        }catch(Exception e){
            e.printStackTrace();
            message="Invalid Number: "+e.getMessage().split(":")[1]+"\n Please enter valid number.";
            Calculator.this.showPopupMessage(message);
            return false;
        }
        if (tempResult!=0&&resultValue!=0) {
            operationValue();
            return true;
        }
        return false;
    }

    public double operationValue(){
        double a=0,b=0;

        if (tempResult != 0 && resultValue != 0 ) {
            switch (operator) {
                case "+":
                    result = tempResult + resultValue;

                    break;
                case "-":
                    result = tempResult - resultValue;

                    break;
                case "*":
                    result = tempResult * resultValue;

                    break;
                case "/":
                    result = tempResult / resultValue;

                    break;
                case "%":
                    result = tempResult % resultValue;

                    break;
                case "^":
                    Float temp = new Float(tempResult);
                    a = temp.doubleValue();
                    Float temp1 = new Float(resultValue);
                    b = temp1.doubleValue();
                    result=  Math.pow(a,b);

                    break;

                case "DEL":
                    result = tempResult - resultValue;

                    break;
                case ".":
                    result = tempResult - resultValue;

                    break;
                default:
                    break;

            }
        }


            setValues();

    return result;
    }
    public void setTempValues()
    {
        resultValue = 0;
        tempResult = 0;
        operator="";

    }
public void setValues()
{
    topOpp.setText(tempResult+operator+resultValue);

    tep.setText("First number : "+Float.toString( tempResult));
    res.setText("Second Number : "+Float.toString( resultValue));
    opp.setText("Operator : "+operator);

}
    public void showPopupMessage(String msg)
    {
        AlertDialog.Builder popup =new AlertDialog.Builder(this);
        popup.setTitle("Error Message");
        popup.setMessage(msg);
        popup.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
                editText.setText("");
            }
        });
        popup.show();
    }
    private void numberButtonGeneration()
    {editText.setText("");
        editText.setSelection(editText.getText().length());

        TableLayout table=(TableLayout) findViewById(R.id.tableLayoutButton);

        for (int row=0;row<ROWS;row++)
        {
            TableRow tableRow=new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.WRAP_CONTENT,
                    TableLayout.LayoutParams.WRAP_CONTENT, 1.0f));
            table.addView(tableRow);

            for(int col=0;col<COLS;col++)
            { number=number+1;
                final Button button = new Button(this);
                button.setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT, 1.0f));
                tableRow.addView(button);
                button.setText(String.valueOf(number));
                button.setMaxWidth(10);
                button.setMinWidth(10);
                button.setMaxHeight(10);
                button.setTextColor(Color.parseColor("blue"));
                button.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {

                                                        String enterValue = editText.getText() + (String) button.getText();
                                                        editText.setText(enterValue);
                                                  editText.setTextColor(Color.parseColor("blue"));
                                                  editText.setSelection(editText.getText().length());



                                              }
                                          }
                );
            }

        }
        if(number>=9)
            number=0;

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
