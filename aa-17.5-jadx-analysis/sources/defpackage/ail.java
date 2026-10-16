package defpackage;

import android.graphics.Rect;
import androidx.car.app.model.Row;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ail<T> implements Comparator {
    private final /* synthetic */ int a;

    public ail(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return affa.x(Float.valueOf(((ahs) obj).a), Float.valueOf(((ahs) obj2).a));
            case 1:
                return affa.x(Integer.valueOf(((aig) obj).a), Integer.valueOf(((aig) obj2).a));
            case 2:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                zu zuVar = dwf.a;
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
                return affa.x((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return affa.x((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return affa.x(((fav) obj).a, ((fav) obj2).a);
            case 7:
                return affa.x(((fax) obj).a, ((fax) obj2).a);
            case 8:
                String string = ((Row) obj).getTitle().toString();
                string.getClass();
                String lowerCase = string.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String string2 = ((Row) obj2).getTitle().toString();
                string2.getClass();
                String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                return affa.x(lowerCase, lowerCase2);
            case 9:
                return ((hlx) obj2).b - ((hlx) obj).b;
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
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
                return affa.x(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 12:
                return affa.x(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 13:
                return affa.x(Boolean.valueOf(((nuh) obj).g), Boolean.valueOf(((nuh) obj2).g));
            case 14:
                yph yphVar = nso.a;
                return Integer.compare(((Rect) obj).left, ((Rect) obj2).left);
            case 15:
                yph yphVar2 = nso.a;
                return Integer.compare(((Rect) obj2).right, ((Rect) obj).right);
            case 16:
                yph yphVar3 = nso.a;
                return Integer.compare(((Rect) obj).top, ((Rect) obj2).top);
            case 17:
                yph yphVar4 = nso.a;
                return Integer.compare(((Rect) obj2).bottom, ((Rect) obj).bottom);
            case 18:
                int i2 = nuj.b;
                return (int) (((nuh) obj2).c.i - ((nuh) obj).c.i);
            case 19:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
            default:
                return affa.x(((opt) obj).b, ((opt) obj2).b);
        }
    }
}
