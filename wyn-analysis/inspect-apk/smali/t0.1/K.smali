.class public final Lt0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LX/u;

.field public final b:Lt0/e;

.field public final c:Lt0/e;

.field public final d:Lt0/e;


# direct methods
.method public constructor <init>(Lu0/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LX/u;

    .line 5
    .line 6
    invoke-direct {v0, p1}, LX/u;-><init>(Ltf/l;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt0/K;->a:LX/u;

    .line 10
    .line 11
    sget-object p1, Lt0/e;->p:Lt0/e;

    .line 12
    .line 13
    iput-object p1, p0, Lt0/K;->b:Lt0/e;

    .line 14
    .line 15
    sget-object p1, Lt0/e;->n:Lt0/e;

    .line 16
    .line 17
    iput-object p1, p0, Lt0/K;->c:Lt0/e;

    .line 18
    .line 19
    sget-object p1, Lt0/e;->o:Lt0/e;

    .line 20
    .line 21
    iput-object p1, p0, Lt0/K;->d:Lt0/e;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lt0/J;Ltf/l;Ltf/a;)V
    .locals 1

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onChanged"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "block"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lt0/K;->a:LX/u;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, LX/u;->c(Ljava/lang/Object;Ltf/l;Ltf/a;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
