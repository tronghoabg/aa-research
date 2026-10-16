package androidx.room;

import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.useReaderConnection(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ p<Transactor, e, Object> $block;
        final /* synthetic */ RoomDatabase $this_useReaderConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(RoomDatabase roomDatabase, p<? super Transactor, ? super e, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_useReaderConnection = roomDatabase;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$this_useReaderConnection, this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object objUseConnection = this.$this_useReaderConnection.useConnection(true, this.$block, this);
            return objUseConnection == aVar ? aVar : objUseConnection;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1, reason: invalid class name and case insensitive filesystem */
    final class C04491<R> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04491(e<? super C04491> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.useWriterConnection(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2, reason: invalid class name and case insensitive filesystem */
    final class C04502 extends g implements p<af, e, Object> {
        final /* synthetic */ p<Transactor, e, Object> $block;
        final /* synthetic */ RoomDatabase $this_useWriterConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04502(RoomDatabase roomDatabase, p<? super Transactor, ? super e, ? extends Object> pVar, e<? super C04502> eVar) {
            super(2, eVar);
            this.$this_useWriterConnection = roomDatabase;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C04502(this.$this_useWriterConnection, this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((C04502) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object objUseConnection = this.$this_useWriterConnection.useConnection(false, this.$block, this);
            return objUseConnection == aVar ? aVar : objUseConnection;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object useReaderConnection(androidx.room.RoomDatabase r5, h.g.a.p<? super androidx.room.Transactor, ? super h.c.e<? super R>, ? extends java.lang.Object> r6, h.c.e<? super R> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            h.g.a.p r6 = (h.g.a.p) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            e.b.c.b(r7)
            goto L4f
        L3f:
            e.b.c.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            r7 = 0
            java.lang.Object r7 = androidx.room.util.DBUtil.getCoroutineContext(r5, r7, r0)
            if (r7 == r1) goto L6f
        L4f:
            h.c.j r7 = (h.c.j) r7
            androidx.room.RoomExternalOperationElement r2 = androidx.room.RoomExternalOperationElement.INSTANCE
            h.c.j r2 = (h.c.j) r2
            h.c.j r7 = r7.plus(r2)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.aj.v(r7, r2, r0)
            if (r5 != r1) goto L6e
            goto L6f
        L6e:
            return r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(androidx.room.RoomDatabase, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object useWriterConnection(androidx.room.RoomDatabase r5, h.g.a.p<? super androidx.room.Transactor, ? super h.c.e<? super R>, ? extends java.lang.Object> r6, h.c.e<? super R> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt.C04491
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt.C04491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            e.b.c.b(r7)
            goto L72
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            h.g.a.p r6 = (h.g.a.p) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            e.b.c.b(r7)
            goto L53
        L43:
            e.b.c.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            r7 = 0
            java.lang.Object r7 = androidx.room.util.DBUtil.getCoroutineContext(r5, r7, r0)
            if (r7 == r1) goto L7a
        L53:
            h.c.j r7 = (h.c.j) r7
            androidx.room.RoomExternalOperationElement r2 = androidx.room.RoomExternalOperationElement.INSTANCE
            h.c.j r2 = (h.c.j) r2
            h.c.j r7 = r7.plus(r2)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r7, r2, r0)
            if (r7 != r1) goto L72
            goto L7a
        L72:
            androidx.room.InvalidationTracker r5 = r5.getInvalidationTracker()
            r5.refreshAsync()
            return r7
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(androidx.room.RoomDatabase, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void validateAutoMigrations(androidx.room.RoomDatabase r9, androidx.room.DatabaseConfiguration r10) {
        /*
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r9, r0)
            java.lang.String r0 = "configuration"
            h.g.b.x.f(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r1 = r9.getRequiredAutoMigrationSpecClasses()
            java.util.List<androidx.room.migration.AutoMigrationSpec> r2 = r10.autoMigrationSpecs
            int r2 = r2.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r1.next()
            h.l.c r4 = (h.l.c) r4
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L51
        L39:
            int r7 = r6 + (-1)
            java.util.List<androidx.room.migration.AutoMigrationSpec> r8 = r10.autoMigrationSpecs
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.d(r8)
            if (r8 == 0) goto L4c
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L51
        L4c:
            if (r7 >= 0) goto L4f
            goto L51
        L4f:
            r6 = r7
            goto L39
        L51:
            if (r5 < 0) goto L5d
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L21
        L5d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "A required auto migration spec ("
            r9.<init>(r10)
            java.lang.String r10 = r4.b()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r9)
            throw r10
        L7a:
            java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r10.autoMigrationSpecs
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L9a
        L85:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L92
            boolean r1 = r3[r1]
            if (r1 == 0) goto L92
            if (r4 >= 0) goto L90
            goto L9a
        L90:
            r1 = r4
            goto L85
        L92:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L9a:
            java.util.List r9 = r9.createAutoMigrations(r0)
            java.util.Iterator r9 = r9.iterator()
        La2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r9.next()
            androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            int r2 = r0.startVersion
            int r3 = r0.endVersion
            boolean r1 = r1.contains(r2, r3)
            if (r1 != 0) goto La2
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            r1.addMigration(r0)
            goto La2
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(androidx.room.RoomDatabase, androidx.room.DatabaseConfiguration):void");
    }

    public static final void validateMigrationsNotRequired(Set<Integer> set, Set<Integer> set2) {
        x.f(set, "migrationStartAndEndVersions");
        x.f(set2, "migrationsNotRequiredFrom");
        if (set.isEmpty()) {
            return;
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (set2.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue);
            }
        }
    }

    public static final void validateTypeConverters(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        x.f(roomDatabase, "<this>");
        x.f(databaseConfiguration, "configuration");
        Map<h.l.c<?>, List<h.l.c<?>>> requiredTypeConverterClassesMap$room_runtime = roomDatabase.getRequiredTypeConverterClassesMap$room_runtime();
        boolean[] zArr = new boolean[databaseConfiguration.typeConverters.size()];
        for (Map.Entry<h.l.c<?>, List<h.l.c<?>>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
            h.l.c<?> key = entry.getKey();
            for (h.l.c<?> cVar : entry.getValue()) {
                int size = databaseConfiguration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (cVar.d(databaseConfiguration.typeConverters.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException("A required type converter (" + cVar.b() + ") for " + key.b() + " is missing in the database configuration.");
                }
                roomDatabase.addTypeConverter$room_runtime(cVar, databaseConfiguration.typeConverters.get(size));
            }
        }
        int size2 = databaseConfiguration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + databaseConfiguration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }
}
