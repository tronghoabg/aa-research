package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    protected String _charset;
    protected byte[] _payloadAsBytes;
    protected CharSequence _payloadAsText;

    public RequestPayload(byte[] bArr, String str) {
        this._payloadAsBytes = bArr;
        this._charset = (str == null || str.isEmpty()) ? "UTF-8" : str;
    }

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr == null) {
            return this._payloadAsText.toString();
        }
        try {
            return new String(bArr, this._charset);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public RequestPayload(CharSequence charSequence) {
        this._payloadAsText = charSequence;
    }
}
