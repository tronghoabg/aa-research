package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public final class mqb {
    public static final mpl c = new mpl();
    public final ComponentName a;
    public final mqa b;

    public mqb(ComponentName componentName, mqa mqaVar) {
        mqaVar.getClass();
        this.a = componentName;
        this.b = mqaVar;
    }

    public static final mqb b(Intent intent) {
        return mpl.d(intent);
    }

    public final Intent a() {
        Intent intent = new Intent();
        d(intent);
        return intent;
    }

    public final String c() {
        String strFlattenToString;
        mqa mqaVar = this.b;
        mqa mqaVar2 = mqa.b;
        ComponentName componentName = this.a;
        if (mqaVar == mqaVar2) {
            strFlattenToString = componentName.flattenToString();
        } else {
            strFlattenToString = componentName.flattenToString() + ":" + mqaVar.name();
        }
        strFlattenToString.getClass();
        return strFlattenToString;
    }

    public final void d(Intent intent) {
        intent.getClass();
        intent.setComponent(this.a);
        intent.putExtra("AppKey", c());
    }

    public final boolean e() {
        return this.b == mqa.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqb)) {
            return false;
        }
        mqb mqbVar = (mqb) obj;
        return affa.f(this.a, mqbVar.a) && this.b == mqbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppKey(componentName=" + this.a + ", profileType=" + this.b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqb(ComponentName componentName) {
        this(componentName, (byte[]) null);
        componentName.getClass();
    }

    public /* synthetic */ mqb(ComponentName componentName, byte[] bArr) {
        this(componentName, mqa.b);
    }
}
