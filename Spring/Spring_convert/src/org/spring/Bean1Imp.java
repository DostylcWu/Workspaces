package org.spring;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class Bean1Imp implements Bean1 {



		private String strValue;
		
		private int intValue;
		
		private List listValue;
		
		private Set setValue;
		
		private String[] arrayValue;
		

		
		private Date dateValue;

		public String getStrValue() {
			return strValue;
		}

		public void setStrValue(String strValue) {
			this.strValue = strValue;
		}

		public int getIntValue() {
			return intValue;
		}

		public void setIntValue(int intValue) {
			this.intValue = intValue;
		}

		public List getListValue() {
			return listValue;
		}

		public void setListValue(List listValue) {
			this.listValue = listValue;
		}

		public Set getSetValue() {
			return setValue;
		}

		public void setSetValue(Set setValue) {
			this.setValue = setValue;
		}

		public String[] getArrayValue() {
			return arrayValue;
		}

		public void setArrayValue(String[] arrayValue) {
			this.arrayValue = arrayValue;
		}



		public Date getDateValue() {
			return dateValue;
		}

		public void setDateValue(Date dateValue) {
			this.dateValue = dateValue;
		}
	}


