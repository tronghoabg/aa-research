.class public final Li0/K;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Li0/L;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:LV/d;

.field public final synthetic n:I


# direct methods
.method public constructor <init>(Li0/L;Ljava/lang/String;FFLV/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/K;->i:Li0/L;

    .line 2
    .line 3
    iput-object p2, p0, Li0/K;->j:Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, Li0/K;->k:F

    .line 6
    .line 7
    iput p4, p0, Li0/K;->l:F

    .line 8
    .line 9
    iput-object p5, p0, Li0/K;->m:LV/d;

    .line 10
    .line 11
    iput p6, p0, Li0/K;->n:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Li0/K;->n:I

    .line 10
    .line 11
    or-int/lit8 v6, p1, 0x1

    .line 12
    .line 13
    iget-object v4, p0, Li0/K;->m:LV/d;

    .line 14
    .line 15
    iget-object v1, p0, Li0/K;->j:Ljava/lang/String;

    .line 16
    .line 17
    iget v2, p0, Li0/K;->k:F

    .line 18
    .line 19
    iget-object v0, p0, Li0/K;->i:Li0/L;

    .line 20
    .line 21
    iget v3, p0, Li0/K;->l:F

    .line 22
    .line 23
    invoke-virtual/range {v0 .. v6}, Li0/L;->h(Ljava/lang/String;FFLV/d;LN/o;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lef/C;->a:Lef/C;

    .line 27
    .line 28
    return-object p1
.end method
