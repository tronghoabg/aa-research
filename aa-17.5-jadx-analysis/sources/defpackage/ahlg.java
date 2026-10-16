package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahlg {
    public static long a(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((unsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return unsignedByte * j;
    }

    public static final ahjn abbreviatedType(ahjn ahjnVar, ahlh ahlhVar) {
        ahjnVar.getClass();
        ahlhVar.getClass();
        if (ahjnVar.hasAbbreviatedType()) {
            return ahjnVar.getAbbreviatedType();
        }
        if (ahjnVar.hasAbbreviatedTypeId()) {
            return ahlhVar.get(ahjnVar.getAbbreviatedTypeId());
        }
        return null;
    }

    public static akcl b(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return new akfp(akfs.n(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return akfs.n(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        akfv akfvVar = new akfv(str, dataInput.readUTF(), (int) a(dataInput), (int) a(dataInput));
        akcl akclVar = akcl.a;
        return akfvVar.equals(akclVar) ? akclVar : akfvVar;
    }

    public static final List<ahjn> contextReceiverTypes(ahhc ahhcVar, ahlh ahlhVar) {
        ahhcVar.getClass();
        ahlhVar.getClass();
        List<ahjn> contextReceiverTypeList = ahhcVar.getContextReceiverTypeList();
        if (true == contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = ahhcVar.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(woy.bp(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(ahlhVar.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final ahjn expandedType(ahjq ahjqVar, ahlh ahlhVar) {
        ahjqVar.getClass();
        ahlhVar.getClass();
        if (ahjqVar.hasExpandedType()) {
            ahjn expandedType = ahjqVar.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (ahjqVar.hasExpandedTypeId()) {
            return ahlhVar.get(ahjqVar.getExpandedTypeId());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final ahjn flexibleUpperBound(ahjn ahjnVar, ahlh ahlhVar) {
        ahjnVar.getClass();
        ahlhVar.getClass();
        if (ahjnVar.hasFlexibleUpperBound()) {
            return ahjnVar.getFlexibleUpperBound();
        }
        if (ahjnVar.hasFlexibleUpperBoundId()) {
            return ahlhVar.get(ahjnVar.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(ahif ahifVar) {
        ahifVar.getClass();
        return ahifVar.hasReceiverType() || ahifVar.hasReceiverTypeId();
    }

    public static final ahjn inlineClassUnderlyingType(ahhc ahhcVar, ahlh ahlhVar) {
        ahhcVar.getClass();
        ahlhVar.getClass();
        if (ahhcVar.hasInlineClassUnderlyingType()) {
            return ahhcVar.getInlineClassUnderlyingType();
        }
        if (ahhcVar.hasInlineClassUnderlyingTypeId()) {
            return ahlhVar.get(ahhcVar.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ahjn isInstanceType(ahic ahicVar, ahlh ahlhVar) {
        ahicVar.getClass();
        ahlhVar.getClass();
        if (ahicVar.hasIsInstanceType()) {
            return ahicVar.getIsInstanceType();
        }
        if (ahicVar.hasIsInstanceTypeId()) {
            return ahlhVar.get(ahicVar.getIsInstanceTypeId());
        }
        return null;
    }

    public static final ahjn outerType(ahjn ahjnVar, ahlh ahlhVar) {
        ahjnVar.getClass();
        ahlhVar.getClass();
        if (ahjnVar.hasOuterType()) {
            return ahjnVar.getOuterType();
        }
        if (ahjnVar.hasOuterTypeId()) {
            return ahlhVar.get(ahjnVar.getOuterTypeId());
        }
        return null;
    }

    public static final ahjn receiverType(ahif ahifVar, ahlh ahlhVar) {
        ahifVar.getClass();
        ahlhVar.getClass();
        if (ahifVar.hasReceiverType()) {
            return ahifVar.getReceiverType();
        }
        if (ahifVar.hasReceiverTypeId()) {
            return ahlhVar.get(ahifVar.getReceiverTypeId());
        }
        return null;
    }

    public static final ahjn returnType(ahif ahifVar, ahlh ahlhVar) {
        ahifVar.getClass();
        ahlhVar.getClass();
        if (ahifVar.hasReturnType()) {
            ahjn returnType = ahifVar.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (ahifVar.hasReturnTypeId()) {
            return ahlhVar.get(ahifVar.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final List<ahjn> supertypes(ahhc ahhcVar, ahlh ahlhVar) {
        ahhcVar.getClass();
        ahlhVar.getClass();
        List<ahjn> supertypeList = ahhcVar.getSupertypeList();
        if (true == supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = ahhcVar.getSupertypeIdList();
            supertypeIdList.getClass();
            supertypeList = new ArrayList<>(woy.bp(supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                num.getClass();
                supertypeList.add(ahlhVar.get(num.intValue()));
            }
        }
        return supertypeList;
    }

    public static final ahjn type(ahkb ahkbVar, ahlh ahlhVar) {
        ahkbVar.getClass();
        ahlhVar.getClass();
        if (ahkbVar.hasType()) {
            ahjn type = ahkbVar.getType();
            type.getClass();
            return type;
        }
        if (ahkbVar.hasTypeId()) {
            return ahlhVar.get(ahkbVar.getTypeId());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final ahjn underlyingType(ahjq ahjqVar, ahlh ahlhVar) {
        ahjqVar.getClass();
        ahlhVar.getClass();
        if (ahjqVar.hasUnderlyingType()) {
            ahjn underlyingType = ahjqVar.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (ahjqVar.hasUnderlyingTypeId()) {
            return ahlhVar.get(ahjqVar.getUnderlyingTypeId());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List<ahjn> upperBounds(ahjv ahjvVar, ahlh ahlhVar) {
        ahjvVar.getClass();
        ahlhVar.getClass();
        List<ahjn> upperBoundList = ahjvVar.getUpperBoundList();
        if (true == upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = ahjvVar.getUpperBoundIdList();
            upperBoundIdList.getClass();
            upperBoundList = new ArrayList<>(woy.bp(upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                num.getClass();
                upperBoundList.add(ahlhVar.get(num.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final ahjn varargElementType(ahkb ahkbVar, ahlh ahlhVar) {
        ahkbVar.getClass();
        ahlhVar.getClass();
        if (ahkbVar.hasVarargElementType()) {
            return ahkbVar.getVarargElementType();
        }
        if (ahkbVar.hasVarargElementTypeId()) {
            return ahlhVar.get(ahkbVar.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(ahis ahisVar) {
        ahisVar.getClass();
        return ahisVar.hasReceiverType() || ahisVar.hasReceiverTypeId();
    }

    public static final ahjn receiverType(ahis ahisVar, ahlh ahlhVar) {
        ahisVar.getClass();
        ahlhVar.getClass();
        if (ahisVar.hasReceiverType()) {
            return ahisVar.getReceiverType();
        }
        if (ahisVar.hasReceiverTypeId()) {
            return ahlhVar.get(ahisVar.getReceiverTypeId());
        }
        return null;
    }

    public static final ahjn returnType(ahis ahisVar, ahlh ahlhVar) {
        ahisVar.getClass();
        ahlhVar.getClass();
        if (ahisVar.hasReturnType()) {
            ahjn returnType = ahisVar.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (ahisVar.hasReturnTypeId()) {
            return ahlhVar.get(ahisVar.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final ahjn type(ahjl ahjlVar, ahlh ahlhVar) {
        ahjlVar.getClass();
        ahlhVar.getClass();
        if (ahjlVar.hasType()) {
            return ahjlVar.getType();
        }
        if (ahjlVar.hasTypeId()) {
            return ahlhVar.get(ahjlVar.getTypeId());
        }
        return null;
    }

    public static final List<ahjn> contextReceiverTypes(ahif ahifVar, ahlh ahlhVar) {
        ahifVar.getClass();
        ahlhVar.getClass();
        List<ahjn> contextReceiverTypeList = ahifVar.getContextReceiverTypeList();
        if (true == contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = ahifVar.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(woy.bp(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(ahlhVar.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final List<ahjn> contextReceiverTypes(ahis ahisVar, ahlh ahlhVar) {
        ahisVar.getClass();
        ahlhVar.getClass();
        List<ahjn> contextReceiverTypeList = ahisVar.getContextReceiverTypeList();
        if (true == contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = ahisVar.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(woy.bp(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(ahlhVar.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
