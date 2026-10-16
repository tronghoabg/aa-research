.class public final LK/G;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Ltf/a;

.field public final synthetic j:LZ/k;

.field public final synthetic k:Z

.field public final synthetic l:Le0/E;

.field public final synthetic m:J

.field public final synthetic n:J

.field public final synthetic o:LB/h;

.field public final synthetic p:F

.field public final synthetic q:LD/i;

.field public final synthetic r:LV/d;

.field public final synthetic s:I


# direct methods
.method public constructor <init>(Ltf/a;LZ/k;ZLe0/E;JJLB/h;FLD/i;LV/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/G;->i:Ltf/a;

    .line 2
    .line 3
    iput-object p2, p0, LK/G;->j:LZ/k;

    .line 4
    .line 5
    iput-boolean p3, p0, LK/G;->k:Z

    .line 6
    .line 7
    iput-object p4, p0, LK/G;->l:Le0/E;

    .line 8
    .line 9
    iput-wide p5, p0, LK/G;->m:J

    .line 10
    .line 11
    iput-wide p7, p0, LK/G;->n:J

    .line 12
    .line 13
    iput-object p9, p0, LK/G;->o:LB/h;

    .line 14
    .line 15
    iput p10, p0, LK/G;->p:F

    .line 16
    .line 17
    iput-object p11, p0, LK/G;->q:LD/i;

    .line 18
    .line 19
    iput-object p12, p0, LK/G;->r:LV/d;

    .line 20
    .line 21
    iput p13, p0, LK/G;->s:I

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, LN/o;

    .line 3
    .line 4
    move-object/from16 p1, p2

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    iget p1, p0, LK/G;->s:I

    .line 12
    .line 13
    or-int/lit8 v13, p1, 0x1

    .line 14
    .line 15
    iget-object v11, p0, LK/G;->r:LV/d;

    .line 16
    .line 17
    iget-object v8, p0, LK/G;->o:LB/h;

    .line 18
    .line 19
    iget v9, p0, LK/G;->p:F

    .line 20
    .line 21
    iget-object v0, p0, LK/G;->i:Ltf/a;

    .line 22
    .line 23
    iget-object v1, p0, LK/G;->j:LZ/k;

    .line 24
    .line 25
    iget-boolean v2, p0, LK/G;->k:Z

    .line 26
    .line 27
    iget-object v3, p0, LK/G;->l:Le0/E;

    .line 28
    .line 29
    iget-wide v4, p0, LK/G;->m:J

    .line 30
    .line 31
    iget-wide v6, p0, LK/G;->n:J

    .line 32
    .line 33
    iget-object v10, p0, LK/G;->q:LD/i;

    .line 34
    .line 35
    invoke-static/range {v0 .. v13}, LFe/g;->f(Ltf/a;LZ/k;ZLe0/E;JJLB/h;FLD/i;LV/d;LN/o;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lef/C;->a:Lef/C;

    .line 39
    .line 40
    return-object p1
.end method
