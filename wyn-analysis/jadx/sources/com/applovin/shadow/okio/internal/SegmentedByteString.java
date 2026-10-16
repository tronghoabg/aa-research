package com.applovin.shadow.okio.internal;

import A7.AbstractC0279p0;
import R8.v;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C1681SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ff.m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f;
import tf.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000f\u001a\u00020\r*\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0013\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\"\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010)\u001a4\u0010,\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010/\u001a\u00020&*\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010.H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"", "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lcom/applovin/shadow/okio/SegmentedByteString;", "pos", "segment", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "Lef/C;", HandleInvocationsFromAdViewer.KEY_ACTION, "forEachSegment", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ltf/q;)V", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/SegmentedByteString;IILtf/q;)V", "Lcom/applovin/shadow/okio/ByteString;", "commonSubstring", "(Lcom/applovin/shadow/okio/SegmentedByteString;II)Lcom/applovin/shadow/okio/ByteString;", "", "commonInternalGet", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)B", "commonGetSize", "(Lcom/applovin/shadow/okio/SegmentedByteString;)I", "commonToByteArray", "(Lcom/applovin/shadow/okio/SegmentedByteString;)[B", "Lcom/applovin/shadow/okio/Buffer;", "buffer", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "byteCount", "commonWrite", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;ILcom/applovin/shadow/okio/ByteString;II)Z", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)Z", "target", "targetOffset", "commonCopyInto", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i5, int i10, int i11) {
        AbstractC3340k.e(iArr, "<this>");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i5) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i5) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    public static final void commonCopyInto(@NotNull C1681SegmentedByteString c1681SegmentedByteString, int i5, @NotNull byte[] target, int i10, int i11) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        AbstractC3340k.e(target, "target");
        long j8 = i11;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c1681SegmentedByteString.size(), i5, j8);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i10, j8);
        int i12 = i11 + i5;
        int iSegment = segment(c1681SegmentedByteString, i5);
        while (i5 < i12) {
            int i13 = iSegment == 0 ? 0 : c1681SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c1681SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i5;
            int i16 = (i5 - i13) + i15;
            m.f0(i10, i16, i16 + iMin, c1681SegmentedByteString.getSegments()[iSegment], target);
            i10 += iMin;
            i5 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C1681SegmentedByteString c1681SegmentedByteString, @Nullable Object obj) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        if (obj == c1681SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c1681SegmentedByteString.size() && c1681SegmentedByteString.rangeEquals(0, byteString, 0, c1681SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C1681SegmentedByteString c1681SegmentedByteString) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        return c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C1681SegmentedByteString c1681SegmentedByteString) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        int hashCode = c1681SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c1681SegmentedByteString.getSegments().length;
        int i5 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i5 < length) {
            int i12 = c1681SegmentedByteString.getDirectory()[length + i5];
            int i13 = c1681SegmentedByteString.getDirectory()[i5];
            byte[] bArr = c1681SegmentedByteString.getSegments()[i5];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i5++;
            i11 = i13;
        }
        c1681SegmentedByteString.setHashCode$okio(i10);
        return i10;
    }

    public static final byte commonInternalGet(@NotNull C1681SegmentedByteString c1681SegmentedByteString, int i5) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length - 1], i5, 1L);
        int iSegment = segment(c1681SegmentedByteString, i5);
        return c1681SegmentedByteString.getSegments()[iSegment][(i5 - (iSegment == 0 ? 0 : c1681SegmentedByteString.getDirectory()[iSegment - 1])) + c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull C1681SegmentedByteString c1681SegmentedByteString, int i5, @NotNull ByteString other, int i10, int i11) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        AbstractC3340k.e(other, "other");
        if (i5 < 0 || i5 > c1681SegmentedByteString.size() - i11) {
            return false;
        }
        int i12 = i11 + i5;
        int iSegment = segment(c1681SegmentedByteString, i5);
        while (i5 < i12) {
            int i13 = iSegment == 0 ? 0 : c1681SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c1681SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i5;
            if (!other.rangeEquals(i10, c1681SegmentedByteString.getSegments()[iSegment], (i5 - i13) + i15, iMin)) {
                return false;
            }
            i10 += iMin;
            i5 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C1681SegmentedByteString c1681SegmentedByteString, int i5, int i10) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c1681SegmentedByteString, i10);
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c1681SegmentedByteString.size()) {
            StringBuilder sbL = f.l(iResolveDefaultParameter, "endIndex=", " > length(");
            sbL.append(c1681SegmentedByteString.size());
            sbL.append(')');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        int i11 = iResolveDefaultParameter - i5;
        if (i11 < 0) {
            throw new IllegalArgumentException(v.e(iResolveDefaultParameter, i5, "endIndex=", " < beginIndex=").toString());
        }
        if (i5 == 0 && iResolveDefaultParameter == c1681SegmentedByteString.size()) {
            return c1681SegmentedByteString;
        }
        if (i5 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c1681SegmentedByteString, i5);
        int iSegment2 = segment(c1681SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) m.m0(c1681SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(c1681SegmentedByteString.getDirectory()[i12] - i5, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? c1681SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i5 - i15) + iArr[length];
        return new C1681SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C1681SegmentedByteString c1681SegmentedByteString) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        byte[] bArr = new byte[c1681SegmentedByteString.size()];
        int length = c1681SegmentedByteString.getSegments().length;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i5 < length) {
            int i12 = c1681SegmentedByteString.getDirectory()[length + i5];
            int i13 = c1681SegmentedByteString.getDirectory()[i5];
            int i14 = i13 - i10;
            m.f0(i11, i12, i12 + i14, c1681SegmentedByteString.getSegments()[i5], bArr);
            i11 += i14;
            i5++;
            i10 = i13;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C1681SegmentedByteString c1681SegmentedByteString, @NotNull Buffer buffer, int i5, int i10) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        AbstractC3340k.e(buffer, "buffer");
        int i11 = i5 + i10;
        int iSegment = segment(c1681SegmentedByteString, i5);
        while (i5 < i11) {
            int i12 = iSegment == 0 ? 0 : c1681SegmentedByteString.getDirectory()[iSegment - 1];
            int i13 = c1681SegmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i5;
            int i15 = (i5 - i12) + i14;
            Segment segment = new Segment(c1681SegmentedByteString.getSegments()[iSegment], i15, i15 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                AbstractC3340k.b(segment2);
                Segment segment3 = segment2.prev;
                AbstractC3340k.b(segment3);
                segment3.push(segment);
            }
            i5 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i10);
    }

    public static final void forEachSegment(@NotNull C1681SegmentedByteString c1681SegmentedByteString, @NotNull q action) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        AbstractC3340k.e(action, "action");
        int length = c1681SegmentedByteString.getSegments().length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            int i11 = c1681SegmentedByteString.getDirectory()[length + i5];
            int i12 = c1681SegmentedByteString.getDirectory()[i5];
            action.invoke(c1681SegmentedByteString.getSegments()[i5], Integer.valueOf(i11), Integer.valueOf(i12 - i10));
            i5++;
            i10 = i12;
        }
    }

    public static final int segment(@NotNull C1681SegmentedByteString c1681SegmentedByteString, int i5) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c1681SegmentedByteString.getDirectory(), i5 + 1, 0, c1681SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C1681SegmentedByteString c1681SegmentedByteString, int i5, int i10, q qVar) {
        int iSegment = segment(c1681SegmentedByteString, i5);
        while (i5 < i10) {
            int i11 = iSegment == 0 ? 0 : c1681SegmentedByteString.getDirectory()[iSegment - 1];
            int i12 = c1681SegmentedByteString.getDirectory()[iSegment] - i11;
            int i13 = c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i5;
            qVar.invoke(c1681SegmentedByteString.getSegments()[iSegment], Integer.valueOf((i5 - i11) + i13), Integer.valueOf(iMin));
            i5 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C1681SegmentedByteString c1681SegmentedByteString, int i5, @NotNull byte[] other, int i10, int i11) {
        AbstractC3340k.e(c1681SegmentedByteString, "<this>");
        AbstractC3340k.e(other, "other");
        if (i5 < 0 || i5 > c1681SegmentedByteString.size() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i5;
        int iSegment = segment(c1681SegmentedByteString, i5);
        while (i5 < i12) {
            int i13 = iSegment == 0 ? 0 : c1681SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c1681SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c1681SegmentedByteString.getDirectory()[c1681SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i5;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c1681SegmentedByteString.getSegments()[iSegment], (i5 - i13) + i15, other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i5 += iMin;
            iSegment++;
        }
        return true;
    }
}
