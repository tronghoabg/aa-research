package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public final class etx extends euz {
    public Intent a;
    public String b;

    private static final String j(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return afyh.J(str, "${applicationId}", packageName);
    }

    @Override // defpackage.euz
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, evs.a);
        typedArrayObtainAttributes.getClass();
        String strJ = j(context, typedArrayObtainAttributes.getString(4));
        Intent intent = this.a;
        if (intent == null) {
            intent = new Intent();
            this.a = intent;
        }
        intent.getClass();
        intent.setPackage(strJ);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = String.valueOf(context.getPackageName()).concat(string);
            }
            ComponentName componentName = new ComponentName(context, string);
            Intent intent2 = this.a;
            if (intent2 == null) {
                intent2 = new Intent();
                this.a = intent2;
            }
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        Intent intent3 = this.a;
        if (intent3 == null) {
            intent3 = new Intent();
            this.a = intent3;
        }
        intent3.getClass();
        intent3.setAction(string2);
        String strJ2 = j(context, typedArrayObtainAttributes.getString(2));
        if (strJ2 != null) {
            Uri uri = Uri.parse(strJ2);
            Intent intent4 = this.a;
            if (intent4 == null) {
                intent4 = new Intent();
                this.a = intent4;
            }
            intent4.getClass();
            intent4.setData(uri);
        }
        this.b = j(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.euz
    public final boolean b() {
        return false;
    }

    @Override // defpackage.euz
    public final boolean equals(Object obj) {
        Intent intent;
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof etx) && super.equals(obj) && ((intent = this.a) == null ? ((etx) obj).a == null : intent.filterEquals(((etx) obj).a)) && affa.f(this.b, ((etx) obj).b);
    }

    @Override // defpackage.euz
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.a;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.b;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.euz
    public final String toString() {
        Intent intent = this.a;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.a;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
