package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bqd implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CUSTOM_VOICE_DOWNLOAD(1),
    CUSTOM_VOICE_EDIT(2),
    CUSTOM_VOICE_INFO(3),
    CUSTOM_VOICE_SHARE(4),
    RECORD_NEW_VOICE(5),
    SET_VOICE(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f54523j;

    bqd(int i2) {
        this.f54523j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54523j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54523j);
    }
}
