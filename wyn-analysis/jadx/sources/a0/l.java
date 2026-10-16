package A0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import ef.C2527k;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final g f212a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C2527k f213b = new C2527k(0, 0);

    public static final TextDirectionHeuristic a(int i5) {
        if (i5 == 0) {
            TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
            AbstractC3340k.d(LTR, "LTR");
            return LTR;
        }
        if (i5 == 1) {
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            AbstractC3340k.d(RTL, "RTL");
            return RTL;
        }
        if (i5 == 2) {
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            AbstractC3340k.d(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        }
        if (i5 == 3) {
            TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            AbstractC3340k.d(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        }
        if (i5 == 4) {
            TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
            AbstractC3340k.d(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        }
        if (i5 != 5) {
            TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            AbstractC3340k.d(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        }
        TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
        AbstractC3340k.d(LOCALE, "LOCALE");
        return LOCALE;
    }
}
