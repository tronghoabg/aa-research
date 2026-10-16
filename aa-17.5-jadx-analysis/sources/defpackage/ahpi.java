package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public interface ahpi<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream, ahog ahogVar) throws ahou;

    MessageType parseFrom(ahoa ahoaVar, ahog ahogVar) throws ahou;

    MessageType parseFrom(InputStream inputStream, ahog ahogVar) throws ahou;

    MessageType parsePartialFrom(ahoc ahocVar, ahog ahogVar) throws ahou;
}
