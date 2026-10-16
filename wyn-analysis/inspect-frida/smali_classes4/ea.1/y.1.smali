.class public final Lea/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lkotlin/reflect/KProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/A;

    .line 2
    .line 3
    const-class v1, Lea/y;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/A;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/I;->property2(Lkotlin/jvm/internal/z;)Lkotlin/reflect/KProperty2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object v0, v1, v2

    .line 19
    .line 20
    sput-object v1, Lea/y;->a:[Lkotlin/reflect/KProperty;

    .line 21
    .line 22
    return-void
.end method
