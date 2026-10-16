package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.lambda$static$0((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        }
    };
    private static final Comparator<Sample> VALUE_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
        }
    };
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    /* compiled from: WazeSource */
    class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    public SlidingPercentile(int i2) {
        this.maxWeight = i2;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    public void addSample(int i2, float f2) {
        Sample sample;
        ensureSortedByIndex();
        int i3 = this.recycledSampleCount;
        if (i3 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i4 = i3 - 1;
            this.recycledSampleCount = i4;
            sample = sampleArr[i4];
        } else {
            sample = new Sample();
        }
        int i5 = this.nextSampleIndex;
        this.nextSampleIndex = i5 + 1;
        sample.index = i5;
        sample.weight = i2;
        sample.value = f2;
        this.samples.add(sample);
        this.totalWeight += i2;
        while (true) {
            int i6 = this.totalWeight;
            int i7 = this.maxWeight;
            if (i6 <= i7) {
                return;
            }
            Sample sample2 = this.samples.get(0);
            int i8 = sample2.weight;
            int i9 = i6 - i7;
            if (i8 <= i9) {
                this.totalWeight -= i8;
                this.samples.remove(0);
                int i10 = this.recycledSampleCount;
                if (i10 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i10 + 1;
                    sampleArr2[i10] = sample2;
                }
            } else {
                sample2.weight = i8 - i9;
                this.totalWeight -= i9;
            }
        }
    }

    public float getPercentile(float f2) {
        ensureSortedByValue();
        float f3 = this.totalWeight;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.samples.size();
            ArrayList<Sample> arrayList = this.samples;
            if (i2 >= size) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return this.samples.get(r6.size() - 1).value;
            }
            float f4 = f2 * f3;
            Sample sample = arrayList.get(i2);
            i3 += sample.weight;
            if (i3 >= f4) {
                return sample.value;
            }
            i2++;
        }
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
