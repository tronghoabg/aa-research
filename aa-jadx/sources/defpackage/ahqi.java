package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface ahqi<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream inputStream, defpackage.ahpg ahpgVar) throws defpackage.ahpu;

    MessageType parseFrom(defpackage.ahpa ahpaVar, defpackage.ahpg ahpgVar) throws defpackage.ahpu;

    MessageType parseFrom(java.io.InputStream inputStream, defpackage.ahpg ahpgVar) throws defpackage.ahpu;

    MessageType parsePartialFrom(defpackage.ahpc ahpcVar, defpackage.ahpg ahpgVar) throws defpackage.ahpu;
}
