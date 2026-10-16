.class public final LYf/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LWf/w;

.field public b:Z


# direct methods
.method public constructor <init>(Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 8

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LWf/w;

    .line 10
    .line 11
    new-instance v1, LYf/p;

    .line 12
    .line 13
    const-class v4, LYf/q;

    .line 14
    .line 15
    const-string v5, "readIfAbsent"

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v6, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v3, p0

    .line 22
    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p1, v1}, LWf/w;-><init>(Lkotlinx/serialization/descriptors/SerialDescriptor;LYf/p;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v3, LYf/q;->a:LWf/w;

    .line 29
    .line 30
    return-void
.end method
