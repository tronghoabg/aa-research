package com.waze.ap.b.a.a;

import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bz extends com.google.v.du<bz, bx> implements ca {
    public static final int CAMERA_CONFIGURATION_FIELD_NUMBER = 8;
    public static final int DANGEROUS_CURVE_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int DANGEROUS_INTERSECTION_CONFIGURATION_FIELD_NUMBER = 5;
    public static final int DANGEROUS_MERGE_CONFIGURATION_FIELD_NUMBER = 7;
    public static final int DANGEROUS_SPLIT_CONFIGURATION_FIELD_NUMBER = 6;
    private static final bz DEFAULT_INSTANCE;
    public static final int HIGHWAY_CROSSWALK_CONFIGURATION_FIELD_NUMBER = 13;
    public static final int LANE_ENDING_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int NARROW_BRIDGE_CONFIGURATION_FIELD_NUMBER = 15;
    private static volatile fo<bz> PARSER = null;
    public static final int RAILROAD_CROSSING_CONFIGURATION_FIELD_NUMBER = 10;
    public static final int RAISED_CROSSWALK_CONFIGURATION_FIELD_NUMBER = 12;
    public static final int SCHOOL_ZONE_CONFIGURATION_FIELD_NUMBER = 9;
    public static final int SHOULDER_ENDING_CONFIGURATION_FIELD_NUMBER = 14;
    public static final int SPEED_BUMP_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int TOLL_BOOTH_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int TOPES_CONFIGURATION_FIELD_NUMBER = 2;
    private int permanentHazardTypeConfigurationCase_ = 0;
    private Object permanentHazardTypeConfiguration_;

    static {
        bz bzVar = new bz();
        DEFAULT_INSTANCE = bzVar;
        com.google.v.du.registerDefaultInstance(bz.class, bzVar);
    }

    private bz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCameraConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 8) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerousCurveConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 4) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerousIntersectionConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 5) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerousMergeConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 7) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerousSplitConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 6) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighwayCrosswalkConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 13) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneEndingConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 11) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNarrowBridgeConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 15) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermanentHazardTypeConfiguration() {
        this.permanentHazardTypeConfigurationCase_ = 0;
        this.permanentHazardTypeConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRailroadCrossingConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 10) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRaisedCrosswalkConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 12) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchoolZoneConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 9) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShoulderEndingConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 14) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedBumpConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 1) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollBoothConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 3) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopesConfiguration() {
        if (this.permanentHazardTypeConfigurationCase_ == 2) {
            this.permanentHazardTypeConfigurationCase_ = 0;
            this.permanentHazardTypeConfiguration_ = null;
        }
    }

    public static bz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCameraConfiguration(l lVar) {
        Objects.requireNonNull(lVar);
        if (this.permanentHazardTypeConfigurationCase_ == 8 && this.permanentHazardTypeConfiguration_ != l.getDefaultInstance()) {
            j jVarNewBuilder = l.newBuilder((l) this.permanentHazardTypeConfiguration_);
            jVarNewBuilder.mergeFrom((j) lVar);
            lVar = jVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = lVar;
        this.permanentHazardTypeConfigurationCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDangerousCurveConfiguration(r rVar) {
        Objects.requireNonNull(rVar);
        if (this.permanentHazardTypeConfigurationCase_ == 4 && this.permanentHazardTypeConfiguration_ != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder((r) this.permanentHazardTypeConfiguration_);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = rVar;
        this.permanentHazardTypeConfigurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDangerousIntersectionConfiguration(t tVar) {
        Objects.requireNonNull(tVar);
        if (this.permanentHazardTypeConfigurationCase_ == 5 && this.permanentHazardTypeConfiguration_ != t.getDefaultInstance()) {
            s sVarNewBuilder = t.newBuilder((t) this.permanentHazardTypeConfiguration_);
            sVarNewBuilder.mergeFrom((s) tVar);
            tVar = sVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = tVar;
        this.permanentHazardTypeConfigurationCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDangerousMergeConfiguration(v vVar) {
        Objects.requireNonNull(vVar);
        if (this.permanentHazardTypeConfigurationCase_ == 7 && this.permanentHazardTypeConfiguration_ != v.getDefaultInstance()) {
            u uVarNewBuilder = v.newBuilder((v) this.permanentHazardTypeConfiguration_);
            uVarNewBuilder.mergeFrom((u) vVar);
            vVar = uVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = vVar;
        this.permanentHazardTypeConfigurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDangerousSplitConfiguration(x xVar) {
        Objects.requireNonNull(xVar);
        if (this.permanentHazardTypeConfigurationCase_ == 6 && this.permanentHazardTypeConfiguration_ != x.getDefaultInstance()) {
            w wVarNewBuilder = x.newBuilder((x) this.permanentHazardTypeConfiguration_);
            wVarNewBuilder.mergeFrom((w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = xVar;
        this.permanentHazardTypeConfigurationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHighwayCrosswalkConfiguration(bc bcVar) {
        Objects.requireNonNull(bcVar);
        if (this.permanentHazardTypeConfigurationCase_ == 13 && this.permanentHazardTypeConfiguration_ != bc.getDefaultInstance()) {
            bb bbVarNewBuilder = bc.newBuilder((bc) this.permanentHazardTypeConfiguration_);
            bbVarNewBuilder.mergeFrom((bb) bcVar);
            bcVar = bbVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = bcVar;
        this.permanentHazardTypeConfigurationCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLaneEndingConfiguration(bo boVar) {
        Objects.requireNonNull(boVar);
        if (this.permanentHazardTypeConfigurationCase_ == 11 && this.permanentHazardTypeConfiguration_ != bo.getDefaultInstance()) {
            bn bnVarNewBuilder = bo.newBuilder((bo) this.permanentHazardTypeConfiguration_);
            bnVarNewBuilder.mergeFrom((bn) boVar);
            boVar = bnVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = boVar;
        this.permanentHazardTypeConfigurationCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNarrowBridgeConfiguration(bs bsVar) {
        Objects.requireNonNull(bsVar);
        if (this.permanentHazardTypeConfigurationCase_ == 15 && this.permanentHazardTypeConfiguration_ != bs.getDefaultInstance()) {
            br brVarNewBuilder = bs.newBuilder((bs) this.permanentHazardTypeConfiguration_);
            brVarNewBuilder.mergeFrom((br) bsVar);
            bsVar = brVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = bsVar;
        this.permanentHazardTypeConfigurationCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRailroadCrossingConfiguration(cg cgVar) {
        Objects.requireNonNull(cgVar);
        if (this.permanentHazardTypeConfigurationCase_ == 10 && this.permanentHazardTypeConfiguration_ != cg.getDefaultInstance()) {
            cf cfVarNewBuilder = cg.newBuilder((cg) this.permanentHazardTypeConfiguration_);
            cfVarNewBuilder.mergeFrom((cf) cgVar);
            cgVar = cfVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = cgVar;
        this.permanentHazardTypeConfigurationCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRaisedCrosswalkConfiguration(ci ciVar) {
        Objects.requireNonNull(ciVar);
        if (this.permanentHazardTypeConfigurationCase_ == 12 && this.permanentHazardTypeConfiguration_ != ci.getDefaultInstance()) {
            ch chVarNewBuilder = ci.newBuilder((ci) this.permanentHazardTypeConfiguration_);
            chVarNewBuilder.mergeFrom((ch) ciVar);
            ciVar = chVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = ciVar;
        this.permanentHazardTypeConfigurationCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchoolZoneConfiguration(cq cqVar) {
        Objects.requireNonNull(cqVar);
        if (this.permanentHazardTypeConfigurationCase_ == 9 && this.permanentHazardTypeConfiguration_ != cq.getDefaultInstance()) {
            cp cpVarNewBuilder = cq.newBuilder((cq) this.permanentHazardTypeConfiguration_);
            cpVarNewBuilder.mergeFrom((cp) cqVar);
            cqVar = cpVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = cqVar;
        this.permanentHazardTypeConfigurationCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShoulderEndingConfiguration(cw cwVar) {
        Objects.requireNonNull(cwVar);
        if (this.permanentHazardTypeConfigurationCase_ == 14 && this.permanentHazardTypeConfiguration_ != cw.getDefaultInstance()) {
            cv cvVarNewBuilder = cw.newBuilder((cw) this.permanentHazardTypeConfiguration_);
            cvVarNewBuilder.mergeFrom((cv) cwVar);
            cwVar = cvVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = cwVar;
        this.permanentHazardTypeConfigurationCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedBumpConfiguration(cy cyVar) {
        Objects.requireNonNull(cyVar);
        if (this.permanentHazardTypeConfigurationCase_ == 1 && this.permanentHazardTypeConfiguration_ != cy.getDefaultInstance()) {
            cx cxVarNewBuilder = cy.newBuilder((cy) this.permanentHazardTypeConfiguration_);
            cxVarNewBuilder.mergeFrom((cx) cyVar);
            cyVar = cxVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = cyVar;
        this.permanentHazardTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollBoothConfiguration(dh dhVar) {
        Objects.requireNonNull(dhVar);
        if (this.permanentHazardTypeConfigurationCase_ == 3 && this.permanentHazardTypeConfiguration_ != dh.getDefaultInstance()) {
            dg dgVarNewBuilder = dh.newBuilder((dh) this.permanentHazardTypeConfiguration_);
            dgVarNewBuilder.mergeFrom((dg) dhVar);
            dhVar = dgVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = dhVar;
        this.permanentHazardTypeConfigurationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopesConfiguration(dj djVar) {
        Objects.requireNonNull(djVar);
        if (this.permanentHazardTypeConfigurationCase_ == 2 && this.permanentHazardTypeConfiguration_ != dj.getDefaultInstance()) {
            di diVarNewBuilder = dj.newBuilder((dj) this.permanentHazardTypeConfiguration_);
            diVarNewBuilder.mergeFrom((di) djVar);
            djVar = diVarNewBuilder.buildPartial();
        }
        this.permanentHazardTypeConfiguration_ = djVar;
        this.permanentHazardTypeConfigurationCase_ = 2;
    }

    public static bx newBuilder() {
        return (bx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bz parseDelimitedFrom(InputStream inputStream) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(com.google.v.v vVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCameraConfiguration(l lVar) {
        Objects.requireNonNull(lVar);
        this.permanentHazardTypeConfiguration_ = lVar;
        this.permanentHazardTypeConfigurationCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerousCurveConfiguration(r rVar) {
        Objects.requireNonNull(rVar);
        this.permanentHazardTypeConfiguration_ = rVar;
        this.permanentHazardTypeConfigurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerousIntersectionConfiguration(t tVar) {
        Objects.requireNonNull(tVar);
        this.permanentHazardTypeConfiguration_ = tVar;
        this.permanentHazardTypeConfigurationCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerousMergeConfiguration(v vVar) {
        Objects.requireNonNull(vVar);
        this.permanentHazardTypeConfiguration_ = vVar;
        this.permanentHazardTypeConfigurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerousSplitConfiguration(x xVar) {
        Objects.requireNonNull(xVar);
        this.permanentHazardTypeConfiguration_ = xVar;
        this.permanentHazardTypeConfigurationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighwayCrosswalkConfiguration(bc bcVar) {
        Objects.requireNonNull(bcVar);
        this.permanentHazardTypeConfiguration_ = bcVar;
        this.permanentHazardTypeConfigurationCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneEndingConfiguration(bo boVar) {
        Objects.requireNonNull(boVar);
        this.permanentHazardTypeConfiguration_ = boVar;
        this.permanentHazardTypeConfigurationCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNarrowBridgeConfiguration(bs bsVar) {
        Objects.requireNonNull(bsVar);
        this.permanentHazardTypeConfiguration_ = bsVar;
        this.permanentHazardTypeConfigurationCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRailroadCrossingConfiguration(cg cgVar) {
        Objects.requireNonNull(cgVar);
        this.permanentHazardTypeConfiguration_ = cgVar;
        this.permanentHazardTypeConfigurationCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRaisedCrosswalkConfiguration(ci ciVar) {
        Objects.requireNonNull(ciVar);
        this.permanentHazardTypeConfiguration_ = ciVar;
        this.permanentHazardTypeConfigurationCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchoolZoneConfiguration(cq cqVar) {
        Objects.requireNonNull(cqVar);
        this.permanentHazardTypeConfiguration_ = cqVar;
        this.permanentHazardTypeConfigurationCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShoulderEndingConfiguration(cw cwVar) {
        Objects.requireNonNull(cwVar);
        this.permanentHazardTypeConfiguration_ = cwVar;
        this.permanentHazardTypeConfigurationCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedBumpConfiguration(cy cyVar) {
        Objects.requireNonNull(cyVar);
        this.permanentHazardTypeConfiguration_ = cyVar;
        this.permanentHazardTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollBoothConfiguration(dh dhVar) {
        Objects.requireNonNull(dhVar);
        this.permanentHazardTypeConfiguration_ = dhVar;
        this.permanentHazardTypeConfigurationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopesConfiguration(dj djVar) {
        Objects.requireNonNull(djVar);
        this.permanentHazardTypeConfiguration_ = djVar;
        this.permanentHazardTypeConfigurationCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"permanentHazardTypeConfiguration_", "permanentHazardTypeConfigurationCase_", cy.class, dj.class, dh.class, r.class, t.class, x.class, v.class, l.class, cq.class, cg.class, bo.class, ci.class, bc.class, cw.class, bs.class});
        }
        if (iOrdinal == 3) {
            return new bz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public l getCameraConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 8 ? (l) this.permanentHazardTypeConfiguration_ : l.getDefaultInstance();
    }

    public r getDangerousCurveConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 4 ? (r) this.permanentHazardTypeConfiguration_ : r.getDefaultInstance();
    }

    public t getDangerousIntersectionConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 5 ? (t) this.permanentHazardTypeConfiguration_ : t.getDefaultInstance();
    }

    public v getDangerousMergeConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 7 ? (v) this.permanentHazardTypeConfiguration_ : v.getDefaultInstance();
    }

    public x getDangerousSplitConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 6 ? (x) this.permanentHazardTypeConfiguration_ : x.getDefaultInstance();
    }

    public bc getHighwayCrosswalkConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 13 ? (bc) this.permanentHazardTypeConfiguration_ : bc.getDefaultInstance();
    }

    public bo getLaneEndingConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 11 ? (bo) this.permanentHazardTypeConfiguration_ : bo.getDefaultInstance();
    }

    public bs getNarrowBridgeConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 15 ? (bs) this.permanentHazardTypeConfiguration_ : bs.getDefaultInstance();
    }

    public by getPermanentHazardTypeConfigurationCase() {
        switch (this.permanentHazardTypeConfigurationCase_) {
            case 0:
                return by.p;
            case 1:
                return by.f15025a;
            case 2:
                return by.f15026b;
            case 3:
                return by.f15027c;
            case 4:
                return by.f15028d;
            case 5:
                return by.f15029e;
            case 6:
                return by.f15030f;
            case 7:
                return by.f15031g;
            case 8:
                return by.f15032h;
            case 9:
                return by.f15033i;
            case 10:
                return by.f15034j;
            case 11:
                return by.f15035k;
            case 12:
                return by.f15036l;
            case 13:
                return by.m;
            case 14:
                return by.n;
            case 15:
                return by.o;
            default:
                return null;
        }
    }

    public cg getRailroadCrossingConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 10 ? (cg) this.permanentHazardTypeConfiguration_ : cg.getDefaultInstance();
    }

    public ci getRaisedCrosswalkConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 12 ? (ci) this.permanentHazardTypeConfiguration_ : ci.getDefaultInstance();
    }

    public cq getSchoolZoneConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 9 ? (cq) this.permanentHazardTypeConfiguration_ : cq.getDefaultInstance();
    }

    public cw getShoulderEndingConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 14 ? (cw) this.permanentHazardTypeConfiguration_ : cw.getDefaultInstance();
    }

    public cy getSpeedBumpConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 1 ? (cy) this.permanentHazardTypeConfiguration_ : cy.getDefaultInstance();
    }

    public dh getTollBoothConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 3 ? (dh) this.permanentHazardTypeConfiguration_ : dh.getDefaultInstance();
    }

    public dj getTopesConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 2 ? (dj) this.permanentHazardTypeConfiguration_ : dj.getDefaultInstance();
    }

    public boolean hasCameraConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 8;
    }

    public boolean hasDangerousCurveConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 4;
    }

    public boolean hasDangerousIntersectionConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 5;
    }

    public boolean hasDangerousMergeConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 7;
    }

    public boolean hasDangerousSplitConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 6;
    }

    public boolean hasHighwayCrosswalkConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 13;
    }

    public boolean hasLaneEndingConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 11;
    }

    public boolean hasNarrowBridgeConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 15;
    }

    public boolean hasRailroadCrossingConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 10;
    }

    public boolean hasRaisedCrosswalkConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 12;
    }

    public boolean hasSchoolZoneConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 9;
    }

    public boolean hasShoulderEndingConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 14;
    }

    public boolean hasSpeedBumpConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 1;
    }

    public boolean hasTollBoothConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 3;
    }

    public boolean hasTopesConfiguration() {
        return this.permanentHazardTypeConfigurationCase_ == 2;
    }

    public static bx newBuilder(bz bzVar) {
        return (bx) DEFAULT_INSTANCE.createBuilder(bzVar);
    }

    public static bz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bz parseFrom(com.google.v.z zVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bz parseFrom(InputStream inputStream) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(ByteBuffer byteBuffer) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bz parseFrom(byte[] bArr) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
