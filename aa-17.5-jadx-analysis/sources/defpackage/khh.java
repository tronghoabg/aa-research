package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import j$.util.Iterator;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class khh {
    public static yfq a;
    private static final yph b = yph.c("GH.ConferencingParser");

    static {
        yfl yflVar = new yfl(4);
        Iterator<E> it = acsu.e().b.iterator();
        while (it.hasNext()) {
            yflVar.i(Pattern.compile((String) it.next()));
        }
        a = yflVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yfq a(final String str, boolean z) {
        Object obj;
        Object obj2;
        Context context = mki.a.c;
        context.getClass();
        if (!zny.a) {
            synchronized (zny.b) {
                if (!zny.a) {
                    ajds.a(context);
                    zny.a = true;
                }
            }
        }
        if (str == null) {
            ((ype) ((ype) b.f()).ai((char) 3087)).u("Parsing text is null. Returning empty list.");
            int i = yfq.d;
            return yls.a;
        }
        yph yphVar = b;
        ((ype) yphVar.l().ai(3085)).w("Parsing text of length %d", str.length());
        zon zonVar = new zon(zop.d(), str, znx.b(Locale.getDefault().getCountry()), zoo.b);
        final HashMap map = new HashMap();
        int i2 = yfq.d;
        final yfl yflVar = new yfl(4);
        Iterator.EL.forEachRemaining(zonVar.iterator(), new Consumer() { // from class: khg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARN: Type inference failed for: r11v3, types: [ogz] */
            @Override // java.util.function.Consumer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r11) {
                /*
                    r10 = this;
                    zol r11 = (defpackage.zol) r11
                    yfq r0 = defpackage.khh.a
                    zop r0 = defpackage.zop.d()
                    zpd r1 = r11.a
                    long r2 = r1.d
                    r4 = 0
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L48
                    java.lang.String r2 = r1.h
                    int r5 = r2.length()
                    if (r5 <= 0) goto L3d
                    int r5 = r1.b
                    r5 = r5 & r4
                    if (r5 == 0) goto L3d
                    int r5 = r1.i
                    int r5 = defpackage.zkt.s(r5)
                    if (r5 != 0) goto L2a
                    goto L3d
                L2a:
                    r6 = 21
                    if (r5 != r6) goto L3d
                    int r1 = r1.c
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>(r2)
                    r0.p(r1, r5)
                    java.lang.String r2 = r5.toString()
                    goto L62
                L3d:
                    int r5 = r2.length()
                    if (r5 > 0) goto L62
                    int r5 = r1.b
                    r5 = r5 & r4
                    if (r5 == 0) goto L62
                L48:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r5 = 20
                    r2.<init>(r5)
                    r2.setLength(r3)
                    int r5 = r1.c
                    java.lang.String r1 = r0.g(r1)
                    r2.append(r1)
                    r0.p(r5, r2)
                    java.lang.String r2 = r2.toString()
                L62:
                    java.util.Map r0 = r1
                    r2.length()
                    boolean r1 = r0.containsKey(r2)
                    if (r1 == 0) goto L74
                    java.lang.Object r1 = r0.get(r2)
                    if (r1 == 0) goto L74
                    return
                L74:
                    yfq r1 = defpackage.khh.a
                    r5 = r1
                    yls r5 = (defpackage.yls) r5
                    int r5 = r5.c
                L7b:
                    r6 = 0
                    if (r3 >= r5) goto Lb0
                    java.lang.String r7 = r2
                    java.lang.Object r8 = r1.get(r3)
                    java.util.regex.Pattern r8 = (java.util.regex.Pattern) r8
                    int r9 = r11.a()
                    java.lang.String r7 = r7.substring(r9)
                    java.util.regex.Matcher r7 = r8.matcher(r7)
                    boolean r9 = r7.find()
                    if (r9 == 0) goto La2
                    int r9 = r7.start()
                    if (r9 != 0) goto La2
                    java.lang.String r6 = r7.group(r4)
                La2:
                    int r3 = r3 + 1
                    if (r6 == 0) goto L7b
                    ogz r11 = new ogz
                    java.lang.String r1 = r8.pattern()
                    r11.<init>(r6, r1)
                    r6 = r11
                Lb0:
                    boolean r11 = r0.containsKey(r2)
                    if (r11 != 0) goto Lbb
                    yfl r10 = r3
                    r10.i(r2)
                Lbb:
                    r0.put(r2, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.khg.accept(java.lang.Object):void");
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        yfl yflVar2 = new yfl(4);
        yfq yfqVarG = yflVar.g();
        int i3 = ((yls) yfqVarG).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) yfqVarG.get(i4);
            ogz ogzVar = (ogz) map.get(str2);
            if (ogzVar != null) {
                obj = ogzVar.a;
                obj2 = ogzVar.b;
            } else {
                obj = null;
                obj2 = null;
            }
            yflVar2.i(new CalendarEventPhoneNumber(str2, (String) obj, (String) obj2, z));
        }
        yfq yfqVarG2 = yflVar2.g();
        ((ype) yphVar.l().ai(3086)).w("Found %d numbers", ((yls) yfqVarG2).c);
        return yfqVarG2;
    }
}
