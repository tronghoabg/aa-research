.class public final Li0/M;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Li0/H;

.field public final synthetic j:Ljava/util/Map;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(Li0/H;Ljava/util/Map;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/M;->i:Li0/H;

    .line 2
    .line 3
    iput-object p2, p0, Li0/M;->j:Ljava/util/Map;

    .line 4
    .line 5
    iput p3, p0, Li0/M;->k:I

    .line 6
    .line 7
    iput p4, p0, Li0/M;->l:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LN/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    iget p2, p0, Li0/M;->k:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    iget-object v0, p0, Li0/M;->j:Ljava/util/Map;

    .line 13
    .line 14
    iget v1, p0, Li0/M;->l:I

    .line 15
    .line 16
    iget-object v2, p0, Li0/M;->i:Li0/H;

    .line 17
    .line 18
    invoke-static {v2, v0, p1, p2, v1}, Lic/d;->b(Li0/H;Ljava/util/Map;LN/o;II)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lef/C;->a:Lef/C;

    .line 22
    .line 23
    return-object p1
.end method
