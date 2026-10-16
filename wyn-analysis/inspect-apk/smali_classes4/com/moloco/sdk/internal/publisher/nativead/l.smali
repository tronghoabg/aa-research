.class public final Lcom/moloco/sdk/internal/publisher/nativead/l;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/C;

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/nativead/o;

.field public final synthetic c:Lcom/moloco/sdk/internal/ortb/model/u;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/ortb/model/u;JLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->b:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->d:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/l;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->b:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->d:J

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/nativead/l;-><init>(Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/ortb/model/u;JLjf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/l;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/nativead/l;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->b:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/moloco/sdk/internal/publisher/nativead/o;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 11
    .line 12
    iget v1, v0, Lcom/moloco/sdk/internal/ortb/model/u;->b:F

    .line 13
    .line 14
    new-instance v2, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lcom/moloco/sdk/internal/ortb/model/u;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, v2, v1}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 30
    .line 31
    iget-wide v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/l;->d:J

    .line 32
    .line 33
    invoke-virtual {v1, p1, v2, v3, v0}, Lcom/moloco/sdk/internal/publisher/C;->b(Lcom/moloco/sdk/publisher/MolocoAd;JLcom/moloco/sdk/internal/ortb/model/d;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lef/C;->a:Lef/C;

    .line 37
    .line 38
    return-object p1
.end method
