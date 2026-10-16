package androidx.room.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
    private final String from;
    private final int id;
    private final int sequence;
    private final String to;

    public ForeignKeyWithSequence(int i2, int i3, String str, String str2) {
        x.f(str, TypedValues.TransitionType.S_FROM);
        x.f(str2, TypedValues.TransitionType.S_TO);
        this.id = i2;
        this.sequence = i3;
        this.from = str;
        this.to = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
        x.f(foreignKeyWithSequence, "other");
        int i2 = this.id - foreignKeyWithSequence.id;
        return i2 == 0 ? this.sequence - foreignKeyWithSequence.sequence : i2;
    }

    public final String getFrom() {
        return this.from;
    }

    public final int getId() {
        return this.id;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final String getTo() {
        return this.to;
    }
}
