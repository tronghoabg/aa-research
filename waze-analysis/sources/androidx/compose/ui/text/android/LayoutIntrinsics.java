package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import h.k.j;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private CharSequence _charSequenceForIntrinsicWidth;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i2;
    }

    private final float computeMaxIntrinsicWidth() {
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float fCeil = boringMetrics != null ? boringMetrics.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(getDesiredWidth$default(this, 0, 0, 3, null));
        }
        return LayoutIntrinsics_androidKt.shouldIncreaseMaxIntrinsic(fCeil, this.charSequence, this.textPaint) ? fCeil + 0.5f : fCeil;
    }

    private final float computeMinIntrinsicWidth() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        int i2 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(this.charSequence, 0, this.charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, LayoutIntrinsics_androidKt.IntRangeComparator);
        int next = lineInstance.next();
        while (true) {
            int i3 = i2;
            i2 = next;
            if (i2 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new j(i3, i2));
            } else {
                j jVar = (j) priorityQueue.peek();
                if (jVar != null && jVar.b() - jVar.a() < i2 - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new j(i3, i2));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar2 = (j) it.next();
        float desiredWidth = getDesiredWidth(jVar2.a(), jVar2.b());
        while (it.hasNext()) {
            j jVar3 = (j) it.next();
            desiredWidth = Math.max(desiredWidth, getDesiredWidth(jVar3.a(), jVar3.b()));
        }
        return desiredWidth;
    }

    private final CharSequence getCharSequenceForIntrinsicWidth() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            return charSequence;
        }
        boolean z = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharSpans;
        CharSequence charSequence2 = this.charSequence;
        if (!z) {
            return charSequence2;
        }
        CharSequence charSequenceStripNonMetricAffectingCharacterStyleSpans = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharacterStyleSpans(charSequence2);
        this._charSequenceForIntrinsicWidth = charSequenceStripNonMetricAffectingCharacterStyleSpans;
        return charSequenceStripNonMetricAffectingCharacterStyleSpans;
    }

    private final float getDesiredWidth(int i2, int i3) {
        return Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), i2, i3, this.textPaint);
    }

    static /* synthetic */ float getDesiredWidth$default(LayoutIntrinsics layoutIntrinsics, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = layoutIntrinsics.getCharSequenceForIntrinsicWidth().length();
        }
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        return layoutIntrinsics.getDesiredWidth(i2, i3);
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            int i2 = this.textDirectionHeuristic;
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayout_androidKt.getTextDirectionHeuristic(i2));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float fComputeMaxIntrinsicWidth = computeMaxIntrinsicWidth();
        this._maxIntrinsicWidth = fComputeMaxIntrinsicWidth;
        return fComputeMaxIntrinsicWidth;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fComputeMinIntrinsicWidth = computeMinIntrinsicWidth();
        this._minIntrinsicWidth = fComputeMinIntrinsicWidth;
        return fComputeMinIntrinsicWidth;
    }
}
