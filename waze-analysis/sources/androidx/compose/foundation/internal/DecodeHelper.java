package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.AndroidColor_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m2382decodeBaselineShifty9eOQZs() {
        return decodeFloat();
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        long jM2384decodeColor0d7_KjU = m2384decodeColor0d7_KjU();
        float fDecodeFloat = decodeFloat();
        float fDecodeFloat2 = decodeFloat();
        return new Shadow(jM2384decodeColor0d7_KjU, (Float.floatToRawIntBits(fDecodeFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fDecodeFloat) << 32), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        int mask = TextDecoration.Companion.getLineThrough().getMask() & iDecodeInt;
        boolean z = (iDecodeInt & TextDecoration.Companion.getUnderline().getMask()) != 0;
        boolean z2 = mask != 0;
        if (!z2 || !z) {
            return z2 ? TextDecoration.Companion.getLineThrough() : z ? TextDecoration.Companion.getUnderline() : TextDecoration.Companion.getNone();
        }
        TextDecoration.Companion companion = TextDecoration.Companion;
        return companion.combine(i.i(companion.getLineThrough(), TextDecoration.Companion.getUnderline()));
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m2383decodeULongsVKNKU() {
        return this.parcel.readLong();
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m2384decodeColor0d7_KjU() {
        return AndroidColor_androidKt.fromColorLong(Color.Companion, this.parcel.readLong());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m2385decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontStyle.Companion.m10668getNormal_LCdwA() : bDecodeByte == 1 ? FontStyle.Companion.m10667getItalic_LCdwA() : FontStyle.Companion.m10668getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m2386decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontSynthesis.Companion.m10679getNoneGVVA2EU() : bDecodeByte == 1 ? FontSynthesis.Companion.m10678getAllGVVA2EU() : bDecodeByte == 3 ? FontSynthesis.Companion.m10680getStyleGVVA2EU() : bDecodeByte == 2 ? FontSynthesis.Companion.m10681getWeightGVVA2EU() : FontSynthesis.Companion.m10679getNoneGVVA2EU();
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                if (bDecodeByte != 2) {
                    if (bDecodeByte != 3) {
                        if (bDecodeByte != 4) {
                            if (bDecodeByte != 5) {
                                if (bDecodeByte != 6) {
                                    if (bDecodeByte != 7) {
                                        if (bDecodeByte != 8) {
                                            if (bDecodeByte != 9) {
                                                if (bDecodeByte != 10) {
                                                    if (bDecodeByte != 11) {
                                                        if (bDecodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m2401setBackground8_81llA(m2384decodeColor0d7_KjU());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m2402setBaselineShift_isdbwI(BaselineShift.m10873boximpl(m2382decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m2407setLetterSpacingR2X_6o(m2387decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() <= 0) {
                                    break;
                                }
                                mutableSpanStyle.m2406setFontSynthesistDdu0R4(FontSynthesis.m10669boximpl(m2386decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() <= 0) {
                                break;
                            }
                            mutableSpanStyle.m2405setFontStylemLjRB2g(FontStyle.m10658boximpl(m2385decodeFontStyle_LCdwA()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m2404setFontSizeR2X_6o(m2387decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m2403setColor8_81llA(m2384decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m2387decodeTextUnitXSAIIZE() {
        byte bDecodeByte = decodeByte();
        long jM11395getSpUIouoOA = bDecodeByte == 1 ? TextUnitType.Companion.m11395getSpUIouoOA() : bDecodeByte == 2 ? TextUnitType.Companion.m11394getEmUIouoOA() : TextUnitType.Companion.m11396getUnspecifiedUIouoOA();
        return TextUnitType.m11390equalsimpl0(jM11395getSpUIouoOA, TextUnitType.Companion.m11396getUnspecifiedUIouoOA()) ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : TextUnitKt.m11374TextUnitanM5pPY(decodeFloat(), jM11395getSpUIouoOA);
    }
}
