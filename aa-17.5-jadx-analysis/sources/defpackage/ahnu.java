package defpackage;

import defpackage.ahpg;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class ahnu<MessageType extends ahpg> implements ahpi<MessageType> {
    private static final ahog EMPTY_REGISTRY = ahog.getEmptyRegistry();

    private MessageType checkMessageInitialized(MessageType messagetype) throws ahou {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        ahou ahouVarAsInvalidProtocolBufferException = newUninitializedMessageException(messagetype).asInvalidProtocolBufferException();
        ahouVarAsInvalidProtocolBufferException.setUnfinishedMessage(messagetype);
        throw ahouVarAsInvalidProtocolBufferException;
    }

    private ahpy newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof ahnt ? ((ahnt) messagetype).newUninitializedMessageException() : new ahpy(messagetype);
    }

    @Override // defpackage.ahpi
    public MessageType parseDelimitedFrom(InputStream inputStream, ahog ahogVar) throws ahou {
        MessageType messagetype = (MessageType) parsePartialDelimitedFrom(inputStream, ahogVar);
        checkMessageInitialized(messagetype);
        return messagetype;
    }

    @Override // defpackage.ahpi
    public MessageType parseFrom(InputStream inputStream, ahog ahogVar) throws ahou {
        MessageType messagetype = (MessageType) parsePartialFrom(inputStream, ahogVar);
        checkMessageInitialized(messagetype);
        return messagetype;
    }

    public MessageType parsePartialDelimitedFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i != -1) {
                return (MessageType) parsePartialFrom(new ahnr(inputStream, ahoc.readRawVarint32(i, inputStream)), ahogVar);
            }
            return null;
        } catch (IOException e) {
            throw new ahou(e.getMessage());
        }
    }

    public MessageType parsePartialFrom(InputStream inputStream, ahog ahogVar) throws ahou {
        ahoc ahocVarNewInstance = ahoc.newInstance(inputStream);
        MessageType partialFrom = parsePartialFrom(ahocVarNewInstance, ahogVar);
        try {
            ahocVarNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (ahou e) {
            e.setUnfinishedMessage(partialFrom);
            throw e;
        }
    }

    @Override // defpackage.ahpi
    public MessageType parseFrom(ahoa ahoaVar, ahog ahogVar) throws ahou {
        MessageType messagetype = (MessageType) parsePartialFrom(ahoaVar, ahogVar);
        checkMessageInitialized(messagetype);
        return messagetype;
    }

    public MessageType parsePartialFrom(ahoa ahoaVar, ahog ahogVar) throws ahou {
        ahoc ahocVarNewCodedInput = ahoaVar.newCodedInput();
        MessageType partialFrom = parsePartialFrom(ahocVarNewCodedInput, ahogVar);
        try {
            ahocVarNewCodedInput.checkLastTagWas(0);
            return partialFrom;
        } catch (ahou e) {
            e.setUnfinishedMessage(partialFrom);
            throw e;
        }
    }
}
