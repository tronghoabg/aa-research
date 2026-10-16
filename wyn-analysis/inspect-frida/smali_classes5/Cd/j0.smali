.class public final LCd/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCd/u0;


# instance fields
.field public final a:Ltf/q;

.field public final b:LCd/u0;


# direct methods
.method public constructor <init>(Ltf/q;LCd/u0;)V
    .locals 1

    .line 1
    const-string v0, "interceptor"

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
    iput-object p1, p0, LCd/j0;->a:Ltf/q;

    .line 10
    .line 11
    iput-object p2, p0, LCd/j0;->b:LCd/u0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(LFd/c;Llf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LCd/j0;->b:LCd/u0;

    .line 2
    .line 3
    iget-object v1, p0, LCd/j0;->a:Ltf/q;

    .line 4
    .line 5
    invoke-interface {v1, v0, p1, p2}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
