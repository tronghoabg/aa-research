package A0;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class c extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CharSequence f203j;
    public final /* synthetic */ TextPaint k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i5, TextPaint textPaint, CharSequence charSequence) {
        super(0);
        this.f202i = i5;
        this.f203j = charSequence;
        this.k = textPaint;
    }

    @Override // tf.a
    public final Object invoke() {
        TextDirectionHeuristic textDirectionHeuristicA = l.a(this.f202i);
        CharSequence text = this.f203j;
        AbstractC3340k.e(text, "text");
        if (textDirectionHeuristicA.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, this.k, null);
    }
}
