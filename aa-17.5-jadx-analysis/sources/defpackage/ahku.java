package defpackage;

/* loaded from: classes3.dex */
public final class ahku {
    private ahku() {
    }

    public static boolean a(CharSequence charSequence) {
        if (charSequence != null) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static int c(int i, Object obj) {
        return (i * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public static boolean d(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!a.ao(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ ahku(afeu afeuVar) {
        this();
    }
}
