/*
 * carstream-game.js — cai moi game HTML nap dau tien.
 *
 *   <script src="../carstream-game.js"></script>
 *
 * Bon viec, khong hon:
 *
 *   CarGame.score(n)        bao diem len thanh tren cua app
 *   CarGame.onPause(fn)     app goi khi nguoi dung roi man hinh game
 *   CarGame.onResume(fn)    quay lai man hinh game
 *   CarGame.over({...})     bang "het van": bao ket qua + diem, co nut choi lai
 *
 * VI SAO BANG HET VAN NAM O DAY chu khong phai trong tung game: het van ma chi
 * doi mot dong chu o bang ben thi nguoi dung khong thay - da tra gia mot lan.
 * De moi game tu ve bang cua no thi ba game ra ba kieu, y het chuyen mau: mo tu
 * danh sach ra la thay nhu app khac. Mot bang dung chung thi game sau chi phai
 * goi mot dong.
 *
 * VI SAO GAME PHAI TU DUNG: WebView.onPause() chan timer, nhung khi chay lai
 * vong lap cua game khong biet minh vua bi dung - no nhay vai giay hoac chay
 * bu mot loat frame. Nghe onPause roi tu dung vong ve moi khong bi nhay.
 *
 * Chay ngoai xe (mo bang trinh duyet de lam game) thi khong co cau CarGame -
 * cac ham duoi tu chay khong, nen khong phai viet hai duong.
 */
(function (global) {
  'use strict';

  var native = global.CarGame || null;   // cau Java, chi co khi chay trong app
  var pauseFns = [];
  var resumeFns = [];
  var paused = false;

  function fire(list) {
    for (var i = 0; i < list.length; i++) {
      try {
        list[i]();
      } catch (e) {
        // Mot ham loi khong duoc keo do ca hang con lai.
      }
    }
  }

  global.addEventListener('cargame:pause', function () {
    if (!paused) {
      paused = true;
      fire(pauseFns);
    }
  });

  global.addEventListener('cargame:resume', function () {
    if (paused) {
      paused = false;
      fire(resumeFns);
    }
  });

  // Doi tab / khoa may cung la tam dung: khong lam thi game chay tiep trong
  // khi khong ai nhin, va diem tu tang.
  global.document.addEventListener('visibilitychange', function () {
    if (global.document.hidden) {
      global.dispatchEvent(new Event('cargame:pause'));
    } else {
      global.dispatchEvent(new Event('cargame:resume'));
    }
  });

  /**
   * Bang mau cua app, de game khong tu chon mau.
   *
   * Trung voi core/Organic.java. Game nao muon mau rieng thi cu dung mau
   * rieng - nhung dung mau nay thi no giong phan con lai cua app.
   */
  var THEME = {
    bg: '#201E1D',
    surface: '#2E2B25',
    text: '#F9F4ED',
    dim: '#C0B6A5',
    accent: '#C67139',
    accentSoft: '#F6A06B',
    accent2: '#8FA073',
    accent2Soft: '#CCDBB2'
  };

  var TOUCH_MIN = 60;

  /* ---------------- bang "het van" ---------------- */

  var overEl = null;        // dung lai, khong dung mot bang moi moi lan het van
  var againFn = null;

  function buildOver() {
    var d = global.document;
    var css =
      '.cg-over{position:fixed;inset:0;z-index:2147483000;display:flex;' +
        'align-items:center;justify-content:center;background:rgba(0,0,0,.62);' +
        'font-family:"Be Vietnam Pro",system-ui,sans-serif;animation:cg-in .14s ease-out}' +
      '.cg-card{min-width:290px;max-width:80vw;padding:30px 34px;border-radius:26px;' +
        'background:' + THEME.surface + ';color:' + THEME.text + ';text-align:center;' +
        'box-shadow:0 20px 50px rgba(0,0,0,.5);animation:cg-pop .16s ease-out}' +
      '.cg-title{font-size:30px;font-weight:700}' +
      '.cg-note{font-size:46px;font-weight:700;line-height:1.1;margin-top:8px;color:' + THEME.accent + '}' +
      '.cg-sub{font-size:16px;margin-top:6px;color:' + THEME.dim + '}' +
      '.cg-btn{display:block;width:100%;margin-top:14px;min-height:' + TOUCH_MIN + 'px;' +
        'border:0;border-radius:999px;font-family:inherit;font-size:19px;font-weight:700;' +
        'cursor:pointer;touch-action:manipulation}' +
      '.cg-again{background:' + THEME.accent + ';color:' + THEME.bg + '}' +
      '.cg-close{background:transparent;color:' + THEME.dim + ';font-size:16px}' +
      '@keyframes cg-in{from{opacity:0}}' +
      '@keyframes cg-pop{from{transform:translateY(14px) scale(.96)}}';
    var st = d.createElement('style');
    st.textContent = css;
    d.head.appendChild(st);

    var el = d.createElement('div');
    el.className = 'cg-over';
    el.style.display = 'none';
    el.innerHTML =
      '<div class="cg-card">' +
        '<div class="cg-title"></div>' +
        '<div class="cg-note"></div>' +
        '<div class="cg-sub"></div>' +
        '<button class="cg-btn cg-again" type="button"></button>' +
        '<button class="cg-btn cg-close" type="button">Đóng</button>' +
      '</div>';
    d.body.appendChild(el);

    el.querySelector('.cg-again').addEventListener('click', function () {
      hideOver();
      if (againFn) { againFn(); }
    });
    // "Dong" chi cat bang di, KHONG choi lai: het van roi van phai xem duoc ban
    // co cuoi cung (2048 xem con ket cho nao, co caro xem duong thang).
    el.querySelector('.cg-close').addEventListener('click', hideOver);
    return el;
  }

  function hideOver() {
    if (overEl) { overEl.style.display = 'none'; }
  }

  global.CarGame = {

    /** Bao diem. Chi goi khi diem THAY DOI, dung goi moi frame. */
    score: function (n) {
      if (native && native.setScore) {
        native.setScore(n | 0);
      }
    },

    onPause: function (fn) {
      if (typeof fn === 'function') {
        pauseFns.push(fn);
      }
    },

    onResume: function (fn) {
      if (typeof fn === 'function') {
        resumeFns.push(fn);
      }
    },

    isPaused: function () {
      return paused;
    },

    /**
     * Het van: hien bang bao ket qua de len khung game.
     *
     *   CarGame.over({
     *     title:   'Hết nước đi',      // dong dau, bat buoc co nghia
     *     note:    '1284 điểm',        // dong to mau cam - cai nguoi ta muon xem
     *     sub:     'Cao nhất 2048',    // dong nho, co the bo
     *     again:   'Ván mới',          // chu tren nut chinh
     *     onAgain: reset               // bam nut chinh thi goi ham nay
     *   });
     *
     * Game phai tu goi CarGame.hideOver() luc bat van moi bang duong khac (nut
     * "Ván mới" o bang ben, phim tat) - khong thi bang con treo tren man.
     */
    over: function (opt) {
      opt = opt || {};
      if (!overEl) { overEl = buildOver(); }
      overEl.querySelector('.cg-title').textContent = opt.title || 'Hết ván';
      var note = overEl.querySelector('.cg-note');
      note.textContent = opt.note || '';
      note.style.display = opt.note ? '' : 'none';
      var sub = overEl.querySelector('.cg-sub');
      sub.textContent = opt.sub || '';
      sub.style.display = opt.sub ? '' : 'none';
      overEl.querySelector('.cg-again').textContent = opt.again || 'Chơi lại';
      againFn = (typeof opt.onAgain === 'function') ? opt.onAgain : null;
      overEl.style.display = 'flex';
    },

    /** Cat bang het van. Goi khi bat dau van moi. */
    hideOver: hideOver,

    /**
     * Bang mau cua app, de game khong tu chon mau.
     *
     * Trung voi core/Organic.java. Game nao muon mau rieng thi cu dung mau
     * rieng - nhung dung mau nay thi no giong phan con lai cua app.
     */
    theme: THEME,

    /**
     * Vung cham toi thieu tren man hinh xe, tinh bang px CSS.
     *
     * Man hinh xe chay o mat do 1.0 nen 60dp = 60px. Moi nut trong game phai
     * >= so nay; nut nho hon la tren xe khong bam duoc.
     */
    TOUCH_MIN: TOUCH_MIN
  };
}(window));
