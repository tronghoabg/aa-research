package defpackage;

import androidx.car.app.model.Badge;

/* loaded from: classes2.dex */
public final class te {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public te(byte[] bArr, byte[] bArr2) {
        this.a = false;
    }

    public final Badge a() {
        boolean z = this.a;
        if (!z && this.c == null) {
            throw new IllegalStateException("A badge must have a dot or an icon set");
        }
        if (z || this.b == null) {
            return new Badge(this);
        }
        throw new IllegalStateException("The dot must be enabled to set the dot color.");
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        this.a = false;
        this.d = uop.NOT_FOUND_LOCALLY;
        this.b = null;
        this.c = null;
    }

    public te() {
    }

    public te(char[] cArr) {
        c();
    }
}
