package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface ahqg extends defpackage.ahqh {
    defpackage.ahqi<? extends defpackage.ahqg> getParserForType();

    int getSerializedSize();

    defpackage.ahqf newBuilderForType();

    defpackage.ahqf toBuilder();

    byte[] toByteArray();

    void writeTo(defpackage.ahpe ahpeVar) throws java.io.IOException;
}
