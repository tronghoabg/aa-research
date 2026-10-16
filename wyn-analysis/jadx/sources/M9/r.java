package m9;

import A7.AbstractC0279p0;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f40506b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c, reason: collision with root package name */
    public static final r f40507c = new r(s9.j.f45378b);

    /* renamed from: a, reason: collision with root package name */
    public final s9.j f40508a;

    public r(List list) {
        this.f40508a = list.isEmpty() ? s9.j.f45379c : new s9.j(list);
    }

    public static r a(String str) {
        Fe.c.l(str, "Provided field path must not be null.");
        Fe.c.k(!f40506b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return b(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    public static r b(String... strArr) {
        Fe.c.k(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i5 = 0;
        while (i5 < strArr.length) {
            String str = strArr[i5];
            boolean z2 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb2 = new StringBuilder("Invalid field name at argument ");
            i5++;
            sb2.append(i5);
            sb2.append(". Field names must not be null or empty.");
            Fe.c.k(z2, sb2.toString(), new Object[0]);
        }
        return new r(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return this.f40508a.equals(((r) obj).f40508a);
    }

    public final int hashCode() {
        return this.f40508a.hashCode();
    }

    public final String toString() {
        return this.f40508a.c();
    }

    public r(s9.j jVar) {
        this.f40508a = jVar;
    }
}
