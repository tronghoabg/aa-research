.class public abstract Le0/C;
.super Le0/m;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Shader;

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Le0/m;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-wide v0, Ld0/f;->c:J

    .line 5
    .line 6
    iput-wide v0, p0, Le0/C;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(FJLc7/l;)V
    .locals 5

    .line 1
    iget-object v0, p0, Le0/C;->a:Landroid/graphics/Shader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p0, Le0/C;->b:J

    .line 6
    .line 7
    invoke-static {v1, v2, p2, p3}, Ld0/f;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p2, p3}, Le0/C;->b(J)Landroid/graphics/Shader;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Le0/C;->a:Landroid/graphics/Shader;

    .line 18
    .line 19
    iput-wide p2, p0, Le0/C;->b:J

    .line 20
    .line 21
    :cond_1
    iget-object p2, p4, Lc7/l;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Landroid/graphics/Paint;

    .line 24
    .line 25
    const-string p3, "<this>"

    .line 26
    .line 27
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-static {p2}, Le0/z;->b(I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    sget-wide v3, Le0/q;->b:J

    .line 39
    .line 40
    invoke-static {v1, v2, v3, v4}, Le0/q;->b(JJ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p4, v3, v4}, Lc7/l;->e(J)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p2, p4, Lc7/l;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Landroid/graphics/Shader;

    .line 52
    .line 53
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-nez p2, :cond_3

    .line 58
    .line 59
    iput-object v0, p4, Lc7/l;->c:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object p2, p4, Lc7/l;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p2, Landroid/graphics/Paint;

    .line 64
    .line 65
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 69
    .line 70
    .line 71
    :cond_3
    iget-object p2, p4, Lc7/l;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/graphics/Paint;->getAlpha()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    int-to-float p2, p2

    .line 83
    const/high16 p3, 0x437f0000    # 255.0f

    .line 84
    .line 85
    div-float/2addr p2, p3

    .line 86
    cmpg-float p2, p2, p1

    .line 87
    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    invoke-virtual {p4, p1}, Lc7/l;->c(F)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public abstract b(J)Landroid/graphics/Shader;
.end method
