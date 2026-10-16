package com.waze.speech;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class SpeechResult {
    private final List<Item> result;
    private final int resultIndex;

    public SpeechResult(List<Item> list, int i2) {
        h.g.b.x.f(list, "result");
        this.result = list;
        this.resultIndex = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpeechResult copy$default(SpeechResult speechResult, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = speechResult.result;
        }
        if ((i3 & 2) != 0) {
            i2 = speechResult.resultIndex;
        }
        return speechResult.copy(list, i2);
    }

    public final List<Item> component1() {
        return this.result;
    }

    public final int component2() {
        return this.resultIndex;
    }

    public final SpeechResult copy(List<Item> list, int i2) {
        h.g.b.x.f(list, "result");
        return new SpeechResult(list, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechResult)) {
            return false;
        }
        SpeechResult speechResult = (SpeechResult) obj;
        return h.g.b.x.n(this.result, speechResult.result) && this.resultIndex == speechResult.resultIndex;
    }

    public final List<Item> getResult() {
        return this.result;
    }

    public final int getResultIndex() {
        return this.resultIndex;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.resultIndex;
    }

    public String toString() {
        return "SpeechResult(result=" + this.result + ", resultIndex=" + this.resultIndex + ")";
    }
}
