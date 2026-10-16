.class public abstract Lfd/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lkotlin/reflect/KProperty;

.field public static final b:Lw1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/y;

    .line 2
    .line 3
    const-class v1, Lfd/I;

    .line 4
    .line 5
    const-string v2, "sharedPreferencesDataStore"

    .line 6
    .line 7
    const-string v3, "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/y;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-array v1, v4, [Lkotlin/reflect/KProperty;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    sput-object v1, Lfd/I;->a:[Lkotlin/reflect/KProperty;

    .line 19
    .line 20
    const-string v0, "FlutterSharedPreferences"

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/16 v2, 0xe

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Ltg/b;->M(Ljava/lang/String;Lac/a;I)Lw1/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lfd/I;->b:Lw1/b;

    .line 30
    .line 31
    return-void
.end method

.method public static final a(Landroid/content/Context;)Lu1/i;
    .locals 2

    .line 1
    sget-object v0, Lfd/I;->a:[Lkotlin/reflect/KProperty;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    sget-object v1, Lfd/I;->b:Lw1/b;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lw1/b;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lu1/i;

    .line 13
    .line 14
    return-object p0
.end method
