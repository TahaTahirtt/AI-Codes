using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace River_Cross_Assignment
{
    public partial class Form1 : Form
    {
        int steps = 1;
        public Form1()
        {
            InitializeComponent();
        }

        private void solveBtn_Click(object sender, EventArgs e)
        {
            switch (steps)
            {
                case 1:
                    C1_L.Visible = false;
                    C2_L.Visible = false;
                    C1_R.Visible = true;
                    C2_R.Visible = true;
                    steps++;
                    break;
                case 2:
                    C1_L.Visible = true;
                    C1_R.Visible = false;
                    steps++;
                    break;
                case 3:
                    C1_L.Visible = false;
                    C3_L.Visible = false;
                    C1_R.Visible = true;
                    C3_R.Visible = true;
                    steps++;
                    break;
                case 4:
                    C3_L.Visible = true;
                    C3_R.Visible = false;
                    steps++;
                    break;
                case 5:
                    M1_L.Visible = false;
                    M2_L.Visible = false;
                    M1_R.Visible = true;
                    M2_R.Visible = true;
                    steps++;
                    break;
                case 6:
                    M1_L.Visible = true;
                    C1_L.Visible = true;
                    M1_R.Visible = false;
                    C1_R.Visible = false;
                    steps++;
                    break;
                case 7:
                    M1_L.Visible = false;
                    M3_L.Visible = false;
                    M1_R.Visible = true;
                    M3_R.Visible = true;
                    steps++;
                    break;
                case 8:
                    C2_L.Visible = true;
                    C2_R.Visible = false;
                    steps++;
                    break;
                case 9:
                    C1_L.Visible = false;
                    C2_L.Visible = false;
                    C1_R.Visible = true;
                    C2_R.Visible = true;
                    steps++;
                    break;
                case 10:
                    C2_L.Visible = true;
                    C2_R.Visible = false;
                    steps++;
                    break;
                case 11:
                    C2_L.Visible = false;
                    C3_L.Visible = false;
                    C2_R.Visible = true;
                    C3_R.Visible = true;
                    steps++;
                    break;
            }
        }
    }
}
