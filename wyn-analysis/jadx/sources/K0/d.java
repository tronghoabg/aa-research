package K0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f6315b = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6316a;

    public d(int i5) {
        this.f6316a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f6316a == ((d) obj).f6316a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6316a;
    }

    public final String toString() {
        int i5 = this.f6316a;
        if (i5 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i5 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i5 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        StringBuilder sb2 = new StringBuilder("TextDecoration[");
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj == null ? true : obj instanceof CharSequence) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        String string = sb3.toString();
        AbstractC3340k.d(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
