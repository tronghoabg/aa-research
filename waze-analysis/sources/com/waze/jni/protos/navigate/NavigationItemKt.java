package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Instruction;
import com.waze.jni.protos.navigate.NavigationItem;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationItemKt {
    public static final NavigationItemKt INSTANCE = new NavigationItemKt();

    private NavigationItemKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationItem.Builder _builder;

        private Dsl(NavigationItem.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationItem _build() {
            NavigationItem navigationItemBuild = this._builder.build();
            x.e(navigationItemBuild, "build(...)");
            return navigationItemBuild;
        }

        public final void clearAddress() {
            this._builder.clearAddress();
        }

        public final void clearDistance() {
            this._builder.clearDistance();
        }

        public final void clearHov() {
            this._builder.clearHov();
        }

        public final void clearIcon() {
            this._builder.clearIcon();
        }

        public final void clearInstruction() {
            this._builder.clearInstruction();
        }

        public final void clearInstructionExit() {
            this._builder.clearInstructionExit();
        }

        public final void clearInstructionSegmentIdx() {
            this._builder.clearInstructionSegmentIdx();
        }

        public final void clearLabel() {
            this._builder.clearLabel();
        }

        public final void clearLat() {
            this._builder.clearLat();
        }

        public final void clearLon() {
            this._builder.clearLon();
        }

        public final void clearNavSegmentIdx() {
            this._builder.clearNavSegmentIdx();
        }

        public final void clearRoadSign() {
            this._builder.clearRoadSign();
        }

        public final void clearRotation() {
            this._builder.clearRotation();
        }

        public final String getAddress() {
            String address = this._builder.getAddress();
            x.e(address, "getAddress(...)");
            return address;
        }

        public final String getDistance() {
            String distance = this._builder.getDistance();
            x.e(distance, "getDistance(...)");
            return distance;
        }

        public final boolean getHov() {
            return this._builder.getHov();
        }

        public final String getIcon() {
            String icon = this._builder.getIcon();
            x.e(icon, "getIcon(...)");
            return icon;
        }

        public final Instruction.Type getInstruction() {
            Instruction.Type instruction = this._builder.getInstruction();
            x.e(instruction, "getInstruction(...)");
            return instruction;
        }

        public final int getInstructionExit() {
            return this._builder.getInstructionExit();
        }

        public final int getInstructionSegmentIdx() {
            return this._builder.getInstructionSegmentIdx();
        }

        public final int getInstructionValue() {
            return this._builder.getInstructionValue();
        }

        public final String getLabel() {
            String label = this._builder.getLabel();
            x.e(label, "getLabel(...)");
            return label;
        }

        public final int getLat() {
            return this._builder.getLat();
        }

        public final int getLon() {
            return this._builder.getLon();
        }

        public final int getNavSegmentIdx() {
            return this._builder.getNavSegmentIdx();
        }

        public final NavigationRoadSign getRoadSign() {
            NavigationRoadSign roadSign = this._builder.getRoadSign();
            x.e(roadSign, "getRoadSign(...)");
            return roadSign;
        }

        public final NavigationRoadSign getRoadSignOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NavigationItemKtKt.getRoadSignOrNull(dsl._builder);
        }

        public final int getRotation() {
            return this._builder.getRotation();
        }

        public final boolean hasRoadSign() {
            return this._builder.hasRoadSign();
        }

        public final void setAddress(String str) {
            x.f(str, "value");
            this._builder.setAddress(str);
        }

        public final void setDistance(String str) {
            x.f(str, "value");
            this._builder.setDistance(str);
        }

        public final void setHov(boolean z) {
            this._builder.setHov(z);
        }

        public final void setIcon(String str) {
            x.f(str, "value");
            this._builder.setIcon(str);
        }

        public final void setInstruction(Instruction.Type type) {
            x.f(type, "value");
            this._builder.setInstruction(type);
        }

        public final void setInstructionExit(int i2) {
            this._builder.setInstructionExit(i2);
        }

        public final void setInstructionSegmentIdx(int i2) {
            this._builder.setInstructionSegmentIdx(i2);
        }

        public final void setInstructionValue(int i2) {
            this._builder.setInstructionValue(i2);
        }

        public final void setLabel(String str) {
            x.f(str, "value");
            this._builder.setLabel(str);
        }

        public final void setLat(int i2) {
            this._builder.setLat(i2);
        }

        public final void setLon(int i2) {
            this._builder.setLon(i2);
        }

        public final void setNavSegmentIdx(int i2) {
            this._builder.setNavSegmentIdx(i2);
        }

        public final void setRoadSign(NavigationRoadSign navigationRoadSign) {
            x.f(navigationRoadSign, "value");
            this._builder.setRoadSign(navigationRoadSign);
        }

        public final void setRotation(int i2) {
            this._builder.setRotation(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationItem.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationItem.Builder builder, o oVar) {
            this(builder);
        }
    }
}
