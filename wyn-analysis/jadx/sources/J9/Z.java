package J9;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final Y f5909a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5910b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5911c;

    /* renamed from: d, reason: collision with root package name */
    public int f5912d = 0;

    public Z(Y y10) {
        boolean z2 = false;
        this.f5909a = y10;
        s8.g gVar = y10.f5908a;
        gVar.a();
        SharedPreferences sharedPreferences = ((Application) gVar.f45328a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z10 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z10 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            y10.a("fresh_install", true);
        }
        this.f5911c = z10;
        s8.g gVar2 = y10.f5908a;
        gVar2.a();
        SharedPreferences sharedPreferences2 = ((Application) gVar2.f45328a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z2 = sharedPreferences2.getBoolean("test_device", false);
        } else {
            y10.a("test_device", false);
        }
        this.f5910b = z2;
    }
}
