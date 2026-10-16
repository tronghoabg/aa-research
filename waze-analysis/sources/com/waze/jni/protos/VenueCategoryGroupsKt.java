package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.VenueCategoryGroups;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueCategoryGroupsKt {
    public static final VenueCategoryGroupsKt INSTANCE = new VenueCategoryGroupsKt();

    private VenueCategoryGroupsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VenueCategoryGroups.Builder _builder;

        /* compiled from: WazeSource */
        public final class GroupsProxy extends c {
            private GroupsProxy() {
            }
        }

        private Dsl(VenueCategoryGroups.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VenueCategoryGroups _build() {
            VenueCategoryGroups venueCategoryGroupsBuild = this._builder.build();
            x.e(venueCategoryGroupsBuild, "build(...)");
            return venueCategoryGroupsBuild;
        }

        public final /* synthetic */ void addAllGroups(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllGroups(iterable);
        }

        public final /* synthetic */ void addGroups(a aVar, VenueCategoryGroup venueCategoryGroup) {
            x.f(aVar, "<this>");
            x.f(venueCategoryGroup, "value");
            this._builder.addGroups(venueCategoryGroup);
        }

        public final /* synthetic */ void clearGroups(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearGroups();
        }

        public final /* synthetic */ a getGroups() {
            List<VenueCategoryGroup> groupsList = this._builder.getGroupsList();
            x.e(groupsList, "getGroupsList(...)");
            return new a(groupsList);
        }

        public final /* synthetic */ void plusAssignAllGroups(a<VenueCategoryGroup, GroupsProxy> aVar, Iterable<VenueCategoryGroup> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllGroups(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignGroups(a<VenueCategoryGroup, GroupsProxy> aVar, VenueCategoryGroup venueCategoryGroup) {
            x.f(aVar, "<this>");
            x.f(venueCategoryGroup, "value");
            addGroups(aVar, venueCategoryGroup);
        }

        public final /* synthetic */ void setGroups(a aVar, int i2, VenueCategoryGroup venueCategoryGroup) {
            x.f(aVar, "<this>");
            x.f(venueCategoryGroup, "value");
            this._builder.setGroups(i2, venueCategoryGroup);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VenueCategoryGroups.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VenueCategoryGroups.Builder builder, o oVar) {
            this(builder);
        }
    }
}
