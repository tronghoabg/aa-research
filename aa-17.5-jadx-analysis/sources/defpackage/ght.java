package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ght {
    public int a;
    public int b;
    public final Set c;
    public final Set d;

    public ght(ghu ghuVar) {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        HashSet hashSet2 = new HashSet();
        this.d = hashSet2;
        this.a = ghuVar.e;
        this.b = ghuVar.f;
        hashSet.addAll(ghuVar.g);
        hashSet2.addAll(ghuVar.h);
    }

    public ght() {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        this.c = new HashSet();
        this.d = new HashSet();
    }
}
