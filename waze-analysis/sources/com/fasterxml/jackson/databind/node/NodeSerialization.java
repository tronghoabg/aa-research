package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class NodeSerialization implements Serializable, Externalizable {
    protected static final int LONGEST_EAGER_ALLOC = 100000;
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }

    private byte[] _read(ObjectInput objectInput, int i2) {
        int length;
        if (i2 <= 100000) {
            byte[] bArr = new byte[i2];
            objectInput.readFully(bArr, 0, i2);
            return bArr;
        }
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(100000);
        byte[] bArrResetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
        while (true) {
            int i3 = 0;
            do {
                length = bArrResetAndGetFirstSegment.length;
                int iMin = Math.min(length - i3, i2);
                objectInput.readFully(bArrResetAndGetFirstSegment, 0, iMin);
                i2 -= iMin;
                i3 += iMin;
                if (i2 == 0) {
                    return byteArrayBuilder.completeAndCoalesce(i3);
                }
            } while (i3 != length);
            bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
        }
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(InternalNodeMapper.valueToBytes(obj));
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e2.getMessage(), e2);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        this.json = _read(objectInput, objectInput.readInt());
    }

    protected Object readResolve() {
        try {
            return InternalNodeMapper.bytesToNode(this.json);
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    public NodeSerialization() {
    }
}
