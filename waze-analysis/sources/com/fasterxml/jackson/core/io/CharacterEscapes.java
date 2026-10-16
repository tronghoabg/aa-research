package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class CharacterEscapes implements Serializable {
    public static int[] standardAsciiEscapesForJSON() {
        int[] iArr = CharTypes.get7BitOutputEscapes();
        return Arrays.copyOf(iArr, iArr.length);
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract SerializableString getEscapeSequence(int i2);
}
