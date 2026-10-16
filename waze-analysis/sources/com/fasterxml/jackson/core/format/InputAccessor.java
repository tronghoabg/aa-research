package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface InputAccessor {
    boolean hasMoreBytes();

    byte nextByte();

    /* compiled from: WazeSource */
    public class Std implements InputAccessor {
        protected final byte[] _buffer;
        protected int _bufferedEnd;
        protected final int _bufferedStart;
        protected final InputStream _in;
        protected int _ptr;

        public Std(byte[] bArr, int i2, int i3) {
            this._in = null;
            this._buffer = bArr;
            this._ptr = i2;
            this._bufferedStart = i2;
            this._bufferedEnd = i2 + i3;
        }

        public DataFormatMatcher createMatcher(JsonFactory jsonFactory, MatchStrength matchStrength) {
            int i2 = this._bufferedEnd;
            int i3 = this._bufferedStart;
            return new DataFormatMatcher(this._in, this._buffer, i3, i2 - i3, jsonFactory, matchStrength);
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public boolean hasMoreBytes() {
            int i2;
            int i3 = this._ptr;
            if (i3 < this._bufferedEnd) {
                return true;
            }
            InputStream inputStream = this._in;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this._buffer;
            int length = bArr.length - i3;
            if (length <= 0 || (i2 = inputStream.read(bArr, i3, length)) <= 0) {
                return false;
            }
            this._bufferedEnd += i2;
            return true;
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public byte nextByte() throws EOFException {
            if (this._ptr < this._bufferedEnd || hasMoreBytes()) {
                byte[] bArr = this._buffer;
                int i2 = this._ptr;
                this._ptr = i2 + 1;
                return bArr[i2];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this._ptr + " bytes (max buffer size: " + this._buffer.length + ")");
        }

        public void reset() {
            this._ptr = this._bufferedStart;
        }

        public Std(InputStream inputStream, byte[] bArr) {
            this._in = inputStream;
            this._buffer = bArr;
            this._bufferedStart = 0;
            this._ptr = 0;
            this._bufferedEnd = 0;
        }

        public Std(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }
    }
}
