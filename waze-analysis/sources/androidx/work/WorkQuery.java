package androidx.work;

import androidx.work.WorkInfo;
import h.a.c;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkQuery {
    public static final Companion Companion = new Companion(null);
    private final List<UUID> ids;
    private final List<WorkInfo.State> states;
    private final List<String> tags;
    private final List<String> uniqueWorkNames;

    public /* synthetic */ WorkQuery(List list, List list2, List list3, List list4, int i2, o oVar) {
        this((i2 & 1) != 0 ? i.h() : list, (i2 & 2) != 0 ? i.h() : list2, (i2 & 4) != 0 ? i.h() : list3, (i2 & 8) != 0 ? i.h() : list4);
    }

    public static final WorkQuery fromIds(List<UUID> list) {
        return Companion.fromIds(list);
    }

    public static final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
        return Companion.fromStates(list);
    }

    public static final WorkQuery fromTags(List<String> list) {
        return Companion.fromTags(list);
    }

    public static final WorkQuery fromUniqueWorkNames(List<String> list) {
        return Companion.fromUniqueWorkNames(list);
    }

    public final List<UUID> getIds() {
        return this.ids;
    }

    public final List<WorkInfo.State> getStates() {
        return this.states;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        public static final Companion Companion = new Companion(null);
        private final List<UUID> ids;
        private final List<WorkInfo.State> states;
        private final List<String> tags;
        private final List<String> uniqueWorkNames;

        private Builder() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }

        public static final Builder fromIds(List<UUID> list) {
            return Companion.fromIds(list);
        }

        public static final Builder fromStates(List<? extends WorkInfo.State> list) {
            return Companion.fromStates(list);
        }

        public static final Builder fromTags(List<String> list) {
            return Companion.fromTags(list);
        }

        public static final Builder fromUniqueWorkNames(List<String> list) {
            return Companion.fromUniqueWorkNames(list);
        }

        public final Builder addIds(List<UUID> list) {
            x.f(list, "ids");
            i.aD(this.ids, list);
            return this;
        }

        public final Builder addStates(List<? extends WorkInfo.State> list) {
            x.f(list, "states");
            i.aD(this.states, list);
            return this;
        }

        public final Builder addTags(List<String> list) {
            x.f(list, "tags");
            i.aD(this.tags, list);
            return this;
        }

        public final Builder addUniqueWorkNames(List<String> list) {
            x.f(list, "uniqueWorkNames");
            i.aD(this.uniqueWorkNames, list);
            return this;
        }

        public final WorkQuery build() {
            if (this.ids.isEmpty() && this.uniqueWorkNames.isEmpty() && this.tags.isEmpty() && this.states.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this.ids, this.uniqueWorkNames, this.tags, this.states);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Builder fromIds(List<UUID> list) {
                x.f(list, "ids");
                Builder builder = new Builder(null);
                builder.addIds(list);
                return builder;
            }

            public final Builder fromStates(List<? extends WorkInfo.State> list) {
                x.f(list, "states");
                Builder builder = new Builder(null);
                builder.addStates(list);
                return builder;
            }

            public final Builder fromTags(List<String> list) {
                x.f(list, "tags");
                Builder builder = new Builder(null);
                builder.addTags(list);
                return builder;
            }

            public final Builder fromUniqueWorkNames(List<String> list) {
                x.f(list, "uniqueWorkNames");
                Builder builder = new Builder(null);
                builder.addUniqueWorkNames(list);
                return builder;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Builder(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WorkQuery fromIds(UUID... uuidArr) {
            x.f(uuidArr, "ids");
            return new WorkQuery(c.X(uuidArr), null, null, null, 14, null);
        }

        public final WorkQuery fromStates(WorkInfo.State... stateArr) {
            x.f(stateArr, "states");
            return new WorkQuery(null, null, null, c.X(stateArr), 7, null);
        }

        public final WorkQuery fromTags(String... strArr) {
            x.f(strArr, "tags");
            return new WorkQuery(null, null, c.X(strArr), null, 11, null);
        }

        public final WorkQuery fromUniqueWorkNames(String... strArr) {
            x.f(strArr, "uniqueWorkNames");
            return new WorkQuery(null, c.X(strArr), null, null, 13, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
            x.f(list, "states");
            return new WorkQuery(null, null, null, list, 7, null);
        }

        public final WorkQuery fromIds(List<UUID> list) {
            x.f(list, "ids");
            return new WorkQuery(list, null, null, null, 14, null);
        }

        public final WorkQuery fromTags(List<String> list) {
            x.f(list, "tags");
            return new WorkQuery(null, null, list, null, 11, null);
        }

        public final WorkQuery fromUniqueWorkNames(List<String> list) {
            x.f(list, "uniqueWorkNames");
            return new WorkQuery(null, list, null, null, 13, null);
        }
    }

    public static final WorkQuery fromIds(UUID... uuidArr) {
        return Companion.fromIds(uuidArr);
    }

    public static final WorkQuery fromStates(WorkInfo.State... stateArr) {
        return Companion.fromStates(stateArr);
    }

    public static final WorkQuery fromTags(String... strArr) {
        return Companion.fromTags(strArr);
    }

    public static final WorkQuery fromUniqueWorkNames(String... strArr) {
        return Companion.fromUniqueWorkNames(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQuery(List<UUID> list, List<String> list2, List<String> list3, List<? extends WorkInfo.State> list4) {
        x.f(list, "ids");
        x.f(list2, "uniqueWorkNames");
        x.f(list3, "tags");
        x.f(list4, "states");
        this.ids = list;
        this.uniqueWorkNames = list2;
        this.tags = list3;
        this.states = list4;
    }

    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }
}
