package I0;

import A7.O0;
import G0.c;
import H0.d;
import ff.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5273a = new a();

    @NotNull
    public final Object a(@NotNull c localeList) {
        AbstractC3340k.e(localeList, "localeList");
        ArrayList arrayList = new ArrayList(p.a0(localeList, 10));
        Iterator it = localeList.f4137a.iterator();
        while (it.hasNext()) {
            G0.b bVar = (G0.b) it.next();
            AbstractC3340k.e(bVar, "<this>");
            arrayList.add(bVar.f4136a.f4135a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        return O0.h(O0.g((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(@NotNull d textPaint, @NotNull c localeList) {
        AbstractC3340k.e(textPaint, "textPaint");
        AbstractC3340k.e(localeList, "localeList");
        ArrayList arrayList = new ArrayList(p.a0(localeList, 10));
        Iterator it = localeList.f4137a.iterator();
        while (it.hasNext()) {
            G0.b bVar = (G0.b) it.next();
            AbstractC3340k.e(bVar, "<this>");
            arrayList.add(bVar.f4136a.f4135a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        textPaint.setTextLocales(O0.g((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
