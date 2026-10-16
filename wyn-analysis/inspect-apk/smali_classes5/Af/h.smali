.class public final LAf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAf/k;


# instance fields
.field public final a:LAf/k;

.field public final b:Ltf/l;

.field public final c:Ltf/l;


# direct methods
.method public constructor <init>(LAf/k;Ltf/l;Ltf/l;)V
    .locals 1

    .line 1
    const-string v0, "sequence"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transformer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LAf/h;->a:LAf/k;

    .line 15
    .line 16
    iput-object p2, p0, LAf/h;->b:Ltf/l;

    .line 17
    .line 18
    iput-object p3, p0, LAf/h;->c:Ltf/l;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LAf/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LAf/f;-><init>(LAf/h;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
