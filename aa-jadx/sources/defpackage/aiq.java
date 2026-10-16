package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aiq<T> implements java.util.Comparator {
    private final /* synthetic */ int a;

    public aiq(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 0:
                return defpackage.afga.x(java.lang.Float.valueOf(((defpackage.ahx) obj).a), java.lang.Float.valueOf(((defpackage.ahx) obj2).a));
            case 1:
                return defpackage.afga.x(java.lang.Integer.valueOf(((defpackage.ail) obj).a), java.lang.Integer.valueOf(((defpackage.ail) obj2).a));
            case 2:
                return java.lang.Integer.parseInt(((java.lang.String) obj).split(":")[0]) - java.lang.Integer.parseInt(((java.lang.String) obj2).split(":")[0]);
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                defpackage.aab aabVar = defpackage.dwm.a;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                return defpackage.afga.x((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case 5:
                return defpackage.afga.x((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case 6:
                return defpackage.afga.x(((defpackage.fbb) obj).a, ((defpackage.fbb) obj2).a);
            case 7:
                return defpackage.afga.x(((defpackage.fbd) obj).a, ((defpackage.fbd) obj2).a);
            case 8:
                java.lang.String string = ((androidx.car.app.model.Row) obj).getTitle().toString();
                string.getClass();
                java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                java.lang.String string2 = ((androidx.car.app.model.Row) obj2).getTitle().toString();
                string2.getClass();
                java.lang.String lowerCase2 = string2.toLowerCase(java.util.Locale.ROOT);
                lowerCase2.getClass();
                return defpackage.afga.x(lowerCase, lowerCase2);
            case 9:
                return ((defpackage.hmd) obj2).b - ((defpackage.hmd) obj).b;
            case 10:
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = (java.lang.String) obj2;
                if (str.equals(str2)) {
                    return 0;
                }
                if ("vnd.android.cursor.item/phone_v2".equals(str)) {
                    return -1;
                }
                if ("vnd.android.cursor.item/phone_v2".equals(str2)) {
                    return 1;
                }
                return str.compareTo(str2);
            case 11:
                return defpackage.afga.x(java.lang.Long.valueOf(((java.io.File) obj2).lastModified()), java.lang.Long.valueOf(((java.io.File) obj).lastModified()));
            case 12:
                return defpackage.afga.x(java.lang.Long.valueOf(((java.io.File) obj).lastModified()), java.lang.Long.valueOf(((java.io.File) obj2).lastModified()));
            case 13:
                return defpackage.afga.x(java.lang.Boolean.valueOf(((defpackage.nuv) obj).g), java.lang.Boolean.valueOf(((defpackage.nuv) obj2).g));
            case 14:
                defpackage.yqm yqmVar = defpackage.ntb.a;
                return java.lang.Integer.compare(((android.graphics.Rect) obj).left, ((android.graphics.Rect) obj2).left);
            case 15:
                defpackage.yqm yqmVar2 = defpackage.ntb.a;
                return java.lang.Integer.compare(((android.graphics.Rect) obj2).right, ((android.graphics.Rect) obj).right);
            case 16:
                defpackage.yqm yqmVar3 = defpackage.ntb.a;
                return java.lang.Integer.compare(((android.graphics.Rect) obj).top, ((android.graphics.Rect) obj2).top);
            case 17:
                defpackage.yqm yqmVar4 = defpackage.ntb.a;
                return java.lang.Integer.compare(((android.graphics.Rect) obj2).bottom, ((android.graphics.Rect) obj).bottom);
            case 18:
                int i2 = defpackage.nuz.b;
                return (int) (((defpackage.nuv) obj2).c.i - ((defpackage.nuv) obj).c.i);
            case 19:
                return ((java.lang.Integer) obj2).intValue() - ((java.lang.Integer) obj).intValue();
            default:
                return defpackage.afga.x(((defpackage.oqm) obj).b, ((defpackage.oqm) obj2).b);
        }
    }
}
