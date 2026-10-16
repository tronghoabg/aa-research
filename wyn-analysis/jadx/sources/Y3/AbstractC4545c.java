package y3;

import android.os.Build;
import java.util.HashSet;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4545c implements InterfaceC4546d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f47990c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f47991a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47992b;

    public AbstractC4545c(String str, String str2) {
        this.f47991a = str;
        this.f47992b = str2;
        f47990c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC4543a.f47988a;
        String str = this.f47992b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
