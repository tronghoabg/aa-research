package defpackage;

import android.util.Property;
import com.google.android.apps.auto.components.system.transcription.TranscriptionTextView;

/* loaded from: classes2.dex */
public final class odh extends Property {
    final /* synthetic */ TranscriptionTextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odh(TranscriptionTextView transcriptionTextView, Class cls) {
        super(cls, "mAlphaSpanProperty");
        this.a = transcriptionTextView;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((odi) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((odi) obj).a = ((Integer) obj2).intValue();
        this.a.invalidate();
    }
}
