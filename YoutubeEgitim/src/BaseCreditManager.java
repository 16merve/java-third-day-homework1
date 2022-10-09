
public abstract class BaseCreditManager implements ICreditManager {
    public void  Calculate() { //Her yerde değişken olan kod.Sadece imza olarak bıraktık içini doldurmadık.
    	
    }
    public void Save(){               //Her yerde ortak olan kod.İçini doldurduk kaydedildi olarak.
    	System.out.println("Kaydedildi.");
    }
    
}
