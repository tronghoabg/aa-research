package com.applovin.shadow.okio.internal;

import Bf.r;
import Va.M6;
import com.applovin.shadow.okio.Base64;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio._JvmPlatformKt;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ff.m;
import java.util.Arrays;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010 \u001a4\u0010$\u001a\u00020#*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u00002\u0006\u0010&\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b'\u0010)\u001a\u001c\u0010+\u001a\u00020\u001d*\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010(\u001a\u001c\u0010+\u001a\u00020\u001d*\u00020\u00002\u0006\u0010*\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b+\u0010)\u001a$\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b-\u0010.\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u00100\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u0010.\u001a\u001e\u00102\u001a\u00020\u001d*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u000101H\u0080\b¢\u0006\u0004\b2\u00103\u001a\u0014\u00104\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010\u0014\u001a\u001c\u00105\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0018\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b8\u00109\u001a$\u0010:\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u0016\u0010>\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b>\u0010=\u001a\u0014\u0010?\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b?\u0010=\u001a+\u0010B\u001a\u00020#*\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010F\u001a\u00020\n2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010H\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\bH\u0010\u0003\u001a\u001f\u0010K\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\nH\u0002¢\u0006\u0004\bK\u0010L\" \u0010N\u001a\u00020M8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/applovin/shadow/okio/ByteString;", "", "commonUtf8", "(Lcom/applovin/shadow/okio/ByteString;)Ljava/lang/String;", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", "commonToAsciiUppercase", "", "beginIndex", "endIndex", "commonSubstring", "(Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/ByteString;", "pos", "", "commonGetByte", "(Lcom/applovin/shadow/okio/ByteString;I)B", "commonGetSize", "(Lcom/applovin/shadow/okio/ByteString;)I", "", "commonToByteArray", "(Lcom/applovin/shadow/okio/ByteString;)[B", "commonInternalArray", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "other", "otherOffset", "byteCount", "", "commonRangeEquals", "(Lcom/applovin/shadow/okio/ByteString;ILcom/applovin/shadow/okio/ByteString;II)Z", "(Lcom/applovin/shadow/okio/ByteString;I[BII)Z", "target", "targetOffset", "Lef/C;", "commonCopyInto", "(Lcom/applovin/shadow/okio/ByteString;I[BII)V", "prefix", "commonStartsWith", "(Lcom/applovin/shadow/okio/ByteString;Lcom/applovin/shadow/okio/ByteString;)Z", "(Lcom/applovin/shadow/okio/ByteString;[B)Z", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "(Lcom/applovin/shadow/okio/ByteString;[BI)I", "commonLastIndexOf", "(Lcom/applovin/shadow/okio/ByteString;Lcom/applovin/shadow/okio/ByteString;I)I", "", "commonEquals", "(Lcom/applovin/shadow/okio/ByteString;Ljava/lang/Object;)Z", "commonHashCode", "commonCompareTo", "(Lcom/applovin/shadow/okio/ByteString;Lcom/applovin/shadow/okio/ByteString;)I", JsonStorageKeyNames.DATA_KEY, "commonOf", "([B)Lcom/applovin/shadow/okio/ByteString;", "commonToByteString", "([BII)Lcom/applovin/shadow/okio/ByteString;", "commonEncodeUtf8", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/ByteString;", "commonDecodeBase64", "commonDecodeHex", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "commonWrite", "(Lcom/applovin/shadow/okio/ByteString;Lcom/applovin/shadow/okio/Buffer;II)V", "", "c", "decodeHexDigit", "(C)I", "commonToString", "s", "codePointCount", "codePointIndexToCharIndex", "([BI)I", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C", "getHEX_DIGIT_CHARS$annotations", "()V", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-ByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class ByteString {

    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull com.applovin.shadow.okio.ByteString other) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i10 = byteString.getByte(i5) & ForkServer.ERROR;
            int i11 = other.getByte(i5) & ForkServer.ERROR;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(@NotNull com.applovin.shadow.okio.ByteString byteString, int i5, @NotNull byte[] target, int i10, int i11) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(target, "target");
        m.f0(i10, i5, i11 + i5, byteString.getData(), target);
    }

    @Nullable
    public static final com.applovin.shadow.okio.ByteString commonDecodeBase64(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new com.applovin.shadow.okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonDecodeHex(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i10 = i5 * 2;
            bArr[i5] = (byte) (decodeHexDigit(str.charAt(i10 + 1)) + (decodeHexDigit(str.charAt(i10)) << 4));
        }
        return new com.applovin.shadow.okio.ByteString(bArr);
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonEncodeUtf8(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        com.applovin.shadow.okio.ByteString byteString = new com.applovin.shadow.okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull com.applovin.shadow.okio.ByteString suffix) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(@NotNull com.applovin.shadow.okio.ByteString byteString, @Nullable Object obj) {
        AbstractC3340k.e(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof com.applovin.shadow.okio.ByteString) {
            com.applovin.shadow.okio.ByteString byteString2 = (com.applovin.shadow.okio.ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull com.applovin.shadow.okio.ByteString byteString, int i5) {
        AbstractC3340k.e(byteString, "<this>");
        return byteString.getData()[i5];
    }

    public static final int commonGetSize(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        return byteString.getData().length;
    }

    public static final int commonHashCode(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(byteString.getData());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        char[] cArr = new char[byteString.getData().length * 2];
        int i5 = 0;
        for (byte b5 : byteString.getData()) {
            int i10 = i5 + 1;
            cArr[i5] = getHEX_DIGIT_CHARS()[(b5 >> 4) & 15];
            i5 += 2;
            cArr[i10] = getHEX_DIGIT_CHARS()[b5 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull byte[] other, int i5) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(other, "other");
        int length = byteString.getData().length - other.length;
        int iMax = Math.max(i5, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        return byteString.getData();
    }

    public static final int commonLastIndexOf(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull com.applovin.shadow.okio.ByteString other, int i5) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i5);
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonOf(@NotNull byte[] data) {
        AbstractC3340k.e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC3340k.d(bArrCopyOf, "copyOf(this, size)");
        return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(@NotNull com.applovin.shadow.okio.ByteString byteString, int i5, @NotNull com.applovin.shadow.okio.ByteString other, int i10, int i11) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(other, "other");
        return other.rangeEquals(i10, byteString.getData(), i5, i11);
    }

    public static final boolean commonStartsWith(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull com.applovin.shadow.okio.ByteString prefix) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonSubstring(@NotNull com.applovin.shadow.okio.ByteString byteString, int i5, int i10) {
        AbstractC3340k.e(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i10);
        if (i5 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > byteString.getData().length) {
            throw new IllegalArgumentException(M6.r(new StringBuilder("endIndex > length("), byteString.getData().length, ')').toString());
        }
        if (iResolveDefaultParameter - i5 >= 0) {
            return (i5 == 0 && iResolveDefaultParameter == byteString.getData().length) ? byteString : new com.applovin.shadow.okio.ByteString(m.k0(i5, iResolveDefaultParameter, byteString.getData()));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonToAsciiLowercase(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        for (int i5 = 0; i5 < byteString.getData().length; i5++) {
            byte b5 = byteString.getData()[i5];
            if (b5 >= 65 && b5 <= 90) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                AbstractC3340k.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i5] = (byte) (b5 + 32);
                for (int i10 = i5 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonToAsciiUppercase(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        for (int i5 = 0; i5 < byteString.getData().length; i5++) {
            byte b5 = byteString.getData()[i5];
            if (b5 >= 97 && b5 <= 122) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                AbstractC3340k.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i5] = (byte) (b5 - 32);
                for (int i10 = i5 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 97 && b10 <= 122) {
                        bArrCopyOf[i10] = (byte) (b10 - 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        byte[] data = byteString.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC3340k.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public static final com.applovin.shadow.okio.ByteString commonToByteString(@NotNull byte[] bArr, int i5, int i10) {
        AbstractC3340k.e(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i10);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i5, iResolveDefaultParameter);
        return new com.applovin.shadow.okio.ByteString(m.k0(i5, iResolveDefaultParameter + i5, bArr));
    }

    @NotNull
    public static final String commonToString(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strH0 = r.h0(r.h0(r.h0(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return AbstractC3256n.f(']', "[text=", strH0);
            }
            return "[size=" + byteString.getData().length + " text=" + strH0 + "…]";
        }
        if (byteString.getData().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(byteString.getData().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData().length) {
            throw new IllegalArgumentException(M6.r(new StringBuilder("endIndex > length("), byteString.getData().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString.getData().length) {
            byteString = new com.applovin.shadow.okio.ByteString(m.k0(0, iResolveDefaultParameter, byteString.getData()));
        }
        sb2.append(byteString.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    @NotNull
    public static final String commonUtf8(@NotNull com.applovin.shadow.okio.ByteString byteString) {
        AbstractC3340k.e(byteString, "<this>");
        String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull Buffer buffer, int i5, int i10) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(buffer, "buffer");
        buffer.write(byteString.getData(), i5, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonEndsWith(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull byte[] suffix) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull byte[] other, int i5) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i5), byteString.getData().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(@NotNull com.applovin.shadow.okio.ByteString byteString, int i5, @NotNull byte[] other, int i10, int i11) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(other, "other");
        return i5 >= 0 && i5 <= byteString.getData().length - i11 && i10 >= 0 && i10 <= other.length - i11 && SegmentedByteString.arrayRangeEquals(byteString.getData(), i5, other, i10, i11);
    }

    public static final boolean commonStartsWith(@NotNull com.applovin.shadow.okio.ByteString byteString, @NotNull byte[] prefix) {
        AbstractC3340k.e(byteString, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }
}
