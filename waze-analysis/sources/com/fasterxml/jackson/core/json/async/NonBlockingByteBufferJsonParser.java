package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.async.NonBlockingInputFeeder;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NonBlockingByteBufferJsonParser extends NonBlockingUtf8JsonParserBase implements NonBlockingInputFeeder {
    private ByteBuffer _inputBuffer;

    public NonBlockingByteBufferJsonParser(IOContext iOContext, int i2, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i2, byteQuadsCanonicalizer);
        this._inputBuffer = ByteBuffer.wrap(NO_BYTES);
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
    protected byte getByteFromBuffer(int i2) {
        return this._inputBuffer.get(i2);
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
    protected byte getNextSignedByteFromBuffer() {
        ByteBuffer byteBuffer = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return byteBuffer.get(i2);
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
    protected int getNextUnsignedByteFromBuffer() {
        ByteBuffer byteBuffer = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return byteBuffer.get(i2) & 255;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public NonBlockingInputFeeder getNonBlockingInputFeeder() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i2 = this._inputEnd - this._inputPtr;
        if (i2 > 0) {
            Channels.newChannel(outputStream).write(this._inputBuffer);
        }
        return i2;
    }
}
