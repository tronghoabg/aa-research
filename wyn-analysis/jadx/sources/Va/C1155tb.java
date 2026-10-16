package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;

/* renamed from: Va.tb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1155tb {

    /* renamed from: a, reason: collision with root package name */
    public Class f14652a;

    /* renamed from: b, reason: collision with root package name */
    public String f14653b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f14654c;

    public static String a(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 7);
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1155tb.class != obj.getClass()) {
            return false;
        }
        C1155tb c1155tb = (C1155tb) obj;
        if (this.f14652a.equals(c1155tb.f14652a) && this.f14653b.equals(c1155tb.f14653b)) {
            return this.f14654c.equals(c1155tb.f14654c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14654c.hashCode() + ((this.f14653b.hashCode() + (this.f14652a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(a("\u0007\u0014￦\ufffe\r\u0001\b�\uffdd\ufffe\uffff\u0002\u0007\u0002\r\u0002\b", 17 - (Process.myTid() >> 22), 109 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.getSize(0) + 2, false).intern());
        sb2.append(a("\u0000\u0012\u0012ￜ\f￮\u0001\t\u0004\u0002\u0013￢\u000b", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 103, Color.blue(0) + 4, false).intern());
        sb2.append(this.f14652a);
        sb2.append(a("\u0010\ufff8\u0018ￋￗￒ￨\u0010\u0018\f\ufff9\u000f\u001a\u0013\u001f", 15 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0) + 93, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, true).intern());
        sb2.append(this.f14653b);
        sb2.append('\'');
        sb2.append(a("\f\u001a￤ￓￇ\u0014￨\u0019\u000e￪\u0013\b\u001a\u001a", Process.getGidForName("") + 15, 96 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false).intern());
        sb2.append(this.f14654c);
        sb2.append('}');
        return sb2.toString();
    }
}
