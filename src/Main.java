import processing.core.PApplet;

import java.util.ArrayList;

import processing.core.PImage;

public class Main extends PApplet {
    float py, turretShootx, turretShooty;
    int wave, actualWave, waveCounter, firecounter, turretcounter, loadx, loadCounter, knifeDamage, counter, credits, health, zombNum, damage, gunPrice, gun, zombKilled, maxGun, nadeCount, maxZombieKilled, currAmmo, pistolAmmo, dualpistolAmmo, sniperAmmo, arAmmo, machinegunAmmo, knifeCounter, knifex, hp, trapNum, knifeUpgrade, nadeDamage, nadeUpgrade, turret1Upgrade, turret2Upgrade, turret3Upgrade, turret1Damage, turret2Damage, turret3Damage, turret1FireRate, turret2FireRate, turret3FireRate, trapUpgrade, trapDamage, trapDurability, pistolDamage, dualPistolDamage, sniperDamage, arDamage, machineGunDamage, pistolFireRate, dualPistolFireRate, sniperFireRate, arFireRate, machineGunFireRate, pistolChange, dualPistolChange, sniperChange, arChange, machineGunChange, fireRate;
    ArrayList<Zomb> zombList;
    ArrayList<Blt> bltList;
    ArrayList<Grenade> nadeList;
    ArrayList<ZombBlt> zombBltList;
    boolean up, down, fire, shop, main, gunBuy, turretBuy, armourBuy, attachBuy, ammoBuy, startScreen, load, start2Screen, gameEnd, grenade, nadeBuy, knife, dayStart, nightStart, turret1, turret2, turret3, pistolUpgrade, dualPistolUpgrade, sniperUpgrade, arUpgrade, machineGunUpgrade, automaticPistol, automaticDualPistol;
    PImage Zomb1, Zomb2, Zomb3, pistol, dualpistol, armourShop, brick, sniper, trapShop, pistolBullet, sniperBullet, arBullet, heavyBullet, soldOut, nadeGet, knifeGet, lock, zombPistol, zomb2Pistol, zombSniper, zombAr, zombHeavy, zombRocket, rocket, zombBullet, collide, explode, glassbullethole, grenadeThrow, handscreen, nade2, noweapon, spear, trap, turret, ar, pistolInventory, machinegun, bullet, ammo_image, startbackground, background4, background5, background6, loadingScreen, start2background, storebackground, ammoStore, gunStore, armourStore, turretStore, attachStore, pistolAttach, dualPistolAttach, sniperAttach, arAttach, machineGunAttach, pistolNoUpgrade, dualPistolNoUpgrade, sniperNoUpgrade, arNoUpgrade, machineGunNoUpgrade, redDotUpgrade, scopeUpgrade, suppressorUpgrade, stockUpgrade, stockUpgrade2, endbackground, background1, background2, background3, dualpistol_image, sniper_image, ar_image, machinegun_image, health_image, armour_image, armour, hammer, scope, house, redDot2, dualPistolInventory, sniperInventory, arInventory, machineGunInventory, grenadeInventory, knifeInventory;

    public void settings() {
        size(1000, 1000);
    }

    public void setup() {
        hp = 100;
        py = 500;
        loadx = 0;
        fire = false;
        load = false;
        startScreen = true;
        start2Screen = false;
        turret1 = false;
        turret2 = false;
        turret3 = false;
        wave = 1;
        turret1Upgrade = 0;
        turret2Upgrade = 0;
        turret3Upgrade = 0;
        trapUpgrade = 0;
        loadCounter = 0;
        trapDurability = 5;
        trapDamage = 50;
        actualWave = 1;
        waveCounter = 0;
        dayStart = false;
        nightStart = false;
        firecounter = 0;
        turretcounter = 0;
        trapNum = 0;
        counter = 0;
        nadeCount = 0;
        nadeUpgrade = 0;
        nadeDamage = 50;
        health = 100;
        credits = 0;
        pistolDamage = 50;
        dualPistolDamage = 50;
        sniperDamage = 300;
        arDamage = 45;
        machineGunDamage = 40;
        pistolFireRate = 60;
        fireRate = pistolFireRate;
        dualPistolFireRate = 40;
        sniperFireRate = 80;
        arFireRate = 20;
        machineGunFireRate = 12;
        automaticPistol = false;
        automaticDualPistol = false;
        pistolAmmo = 80;
        dualpistolAmmo = 50;
        turret1Damage = 50;
        turret2Damage = 50;
        turret3Damage = 50;
        turret1FireRate = 70;
        turret2FireRate = 70;
        turret3FireRate = 70;
        pistolChange = 0;
        dualPistolChange = 0;
        sniperChange = 0;
        arChange = 0;
        machineGunChange = 0;
        sniperAmmo = 15;
        arAmmo = 60;
        machinegunAmmo = 40;
        currAmmo = pistolAmmo;
        zombNum = 5 + (wave * 5);
        shop = false;
        main = false;
        gunBuy = false;
        nadeBuy = false;
        turretBuy = false;
        armourBuy = false;
        ammoBuy = false;
        attachBuy = false;
        pistolUpgrade = true;
        dualPistolUpgrade = false;
        sniperUpgrade = false;
        arUpgrade = false;
        machineGunUpgrade = false;
        zombKilled = 0;
        gameEnd = false;
        zombList = new ArrayList<>();
        bltList = new ArrayList<>();
        nadeList = new ArrayList<>();
        zombBltList = new ArrayList<>();
        grenade = false;
        knife = false;
        knifeUpgrade = 0;
        knifeDamage = 50;
        maxGun = 0;
        gun = 0;
        damage = 50;
        gunPrice = 3000;
        maxZombieKilled = 0;
        Zomb1 = imageSetter("Zomb1.png", 100, 100);
        Zomb2 = imageSetter("Zomb2.png", 100, 80);
        Zomb3 = imageSetter("Zomb3.png", 100, 100);
        zombPistol = imageSetter("zombPistol.png", 150, 160);
        zomb2Pistol = imageSetter("zomb2Pistol.png", 150, 160);
        zombSniper = imageSetter("zombSniper.png", 150, 160);
        zombAr = imageSetter("zombAr.png", 150, 160);
        zombHeavy = imageSetter("zombHeavy.png", 150, 160);
        zombRocket = imageSetter("zombRocket.png", 150, 160);
        rocket = imageSetter("rocket.png", 70, 35);
        zombBullet = imageSetter("zombieBullet.png", 50, 35);
        pistol = imageSetter("pistol.png", 100, 100);
        pistolInventory = imageSetter("pistolInventory.png", 50, 70);
        dualPistolInventory = imageSetter("dualPistolInventory.png", 50, 70);
        sniperInventory = imageSetter("sniperInventory.png", 50, 70);
        arInventory = imageSetter("arInventory.png", 50, 70);
        machineGunInventory = imageSetter("machineGunInventory.png", 50, 70);
        grenadeInventory = imageSetter("grenadeInventory.png", 50, 70);
        knifeInventory = imageSetter("knifeInventory.png", 50, 70);
        dualpistol = imageSetter("2pistol.png", 100, 100);
        sniper = imageSetter("sniper.png", 100, 100);
        ar = imageSetter("AR.png", 100, 100);
        machinegun = imageSetter("machinegun.png", 100, 100);
        bullet = imageSetter("bullet.png", 35, 15);
        ammo_image = imageSetter("ammo_image.png", 400, 600);
        startbackground = imageSetter("startbackground.png", 1000, 1000);
        dualpistol_image = imageSetter("2pistol_image.png", 390, 190);
        sniper_image = imageSetter("sniper_image.png", 390, 190);
        ar_image = imageSetter("ar_image.png", 390, 190);
        machinegun_image = imageSetter("machinegun_image.png", 390, 190);
        health_image = imageSetter("health_image.png", 295, 230);
        armour_image = imageSetter("armour_image.png", 330, 328);
        armour = imageSetter("armour.png", 60, 50);
        armourShop = imageSetter("armourShop.png", 295, 230);
        brick = imageSetter("brick.jpg", 295, 230);
        hammer = imageSetter("hammer.png", 60, 60);
        scope = imageSetter("scope.png", 60, 40);
        house = imageSetter("house.png", 60, 50);
        background1 = imageSetter("background1.png", 1000, 1000);
        background2 = imageSetter("background2.png", 1000, 1000);
        background3 = imageSetter("background3.png", 1000, 1000);
        storebackground = imageSetter("storebackground.png", 1000, 1000);
        gunStore = imageSetter("gunstore.png", 1000, 1000);
        ammoStore = imageSetter("ammoStore.png", 1000, 1000);
        turretStore = imageSetter("turretStore.png", 1000, 1000);
        attachStore = imageSetter("attachStore.png", 1000, 1000);
        armourStore = imageSetter("armourStore.png", 1000, 1000);
        endbackground = imageSetter("end.jpg", 1000, 1000);
        pistolAttach = imageSetter("pistolAttach.png", 170, 96);
        dualPistolAttach = imageSetter("2pistolAttach.png", 170, 96);
        sniperAttach = imageSetter("sniperAttach.png", 170, 96);
        arAttach = imageSetter("arAttach.png", 170, 96);
        machineGunAttach = imageSetter("machineGunAttach.png", 170, 96);
        pistolNoUpgrade = imageSetter("pistolNoUpgrade.png", 450, 300);
        dualPistolNoUpgrade = imageSetter("dualPistolNoUpgrade.png", 450, 300);
        sniperNoUpgrade = imageSetter("sniperNoUpgrade.png", 100, 100);
        arNoUpgrade = imageSetter("arNoUpgrade.png", 100, 100);
        machineGunNoUpgrade = imageSetter("machineGunNoUpgrade.png", 100, 100);
        scopeUpgrade = imageSetter("scopeUpgrade.png", 100, 100);
        suppressorUpgrade = imageSetter("suppressorUpgrade.png", 100, 100);
        stockUpgrade = imageSetter("stockUpgrade.png", 100, 100);
        stockUpgrade2 = imageSetter("stockUpgrade2.png", 100, 100);
        redDotUpgrade = imageSetter("redDotUpgrade.png", 100, 100);
        loadingScreen = imageSetter("loadingscrn.jpg", 1000, 1000);
        start2background = imageSetter("2ndmenu.png", 1000, 1000);
        background4 = imageSetter("background4.png", 1000, 1000);
        background5 = imageSetter("background5.png", 1000, 1000);
        background6 = imageSetter("background6.png", 1000, 1000);
        collide = imageSetter("collide.png", 20, 20);
        explode = imageSetter("explode.png", 400, 400);
        glassbullethole = imageSetter("glassbullethole.png", 100, 125);
        grenadeThrow = imageSetter("grenade.png", 100, 100);
        handscreen = imageSetter("handscreen.png", 175, 125);
        nade2 = imageSetter("nade.png", 20, 20);
        noweapon = imageSetter("noweapon.png", 100, 100);
        spear = imageSetter("spear.png", 170, 10);
        trap = imageSetter("spikewall.png", 300, 700);
        turret = imageSetter("turret.png", 100, 100);
        redDot2 = imageSetter("redDotUpgrade2.png", 100, 100);
        knifeGet = imageSetter("knifeGet.png", 325, 200);
        nadeGet = imageSetter("nadeGet.png", 300, 200);
        lock = imageSetter("lock.png", 375, 300);
        soldOut = imageSetter("soldOut.png", 375, 300);
        pistolBullet = imageSetter("pistolAmmo.png", 200, 80);
        sniperBullet = imageSetter("sniperAmmo.png", 200, 80);
        arBullet = imageSetter("arAmmo.png", 200, 80);
        heavyBullet = imageSetter("heavyAmmo.png", 200, 80);
        trapShop = imageSetter("trapShop.png", 270, 200);
    }

    public void draw() {
        if (startScreen) {
            image(startbackground, 0, 0);
            fill(0);
            textSize(60);
            text("Welcome to Zombie Defense!", 50, 100);
            fill(235);
            textSize(25);
            text("Your goal is to kill all the zombies. They will become harder to kill though.", 50, 200);
            text("Don't let them break your defenses and get into the city.", 50, 300);
            text("You can kill zombies by pressing your mouse.", 50, 400);
            text("You will get credits for killing zombies.", 50, 500);
            text("You can use those credits at the end of the day to buy upgrades", 50, 600);
            text("Hold off the zombies for as long as you can. Good luck!", 50, 700);
            text("Start: ", 50, 800);
            text("Yes", 200, 800);
            text("No", 350, 800);
        }
        if (load) {
            background(loadingScreen);
            loadCounter++;
            fill(255);
            textSize(40);
            text("Update Downloading...", 310, 82);
            fill(0);
            rect(200, 120, 600, 50);
            fill(255);
            loadx++;
            rect(200, 120, loadx, 50);
            if (loadx == 600) {
                start2Screen = true;
                load = false;
            }
        }
        if (start2Screen) {
            background(start2background);
            fill(225);
            textSize(35);
            text("Welcome to Zombie Defense 2!  Whats New??", 40, 60);
            textSize(25);
            text("Grenades: Explode Multiple Zombies", 40, 160);
            text("Ammo: A Necessity when Using Guns", 40, 200);
            text("Knife: If You are Stab Crazy", 40, 240);
            text("Health: In Case You Might Need it *hint hint*", 40, 280);
            text("Turrets: Buy/Upgrade in the Shop", 40, 320);
            text("Trap: Buy/Upgrade in the Shop", 40, 360);
            text("Attachments: Upgrade Your Guns", 40, 400);
            text("Zombies: Something Seems Different...", 40, 440);
            text("Some have GUNS?!?! These only die to body shots", 40, 480);
            text("Inventory: Press the Key corresponding to the weapon to access", 40, 650);
            text("Night: No time to upgrade. Protect the base at Nighttime", 40, 690);
            text("Revamped Shop: Old One Looked KINDA Bad ngl", 40, 730);
            text("Start: ", 50, 800);
            text("Yes", 200, 800);
            text("No", 350, 800);
        }
        if (!startScreen && !gameEnd && !shop && !load && !start2Screen) {
            //wave background: wall and day/nighttime
            if (actualWave % 6 != 0) {
                if (health == 0) {
                    image(background1, 0, 0);
                }
                if (health > 0 && health <= 100) {
                    image(background2, 0, 0);
                }
                if (health > 100) {
                    image(background3, 0, 0);
                }
            }
            if (actualWave % 6 == 0) {
                if (health == 0) {
                    image(background4, 0, 0);
                }
                if (health > 0 && health <= 100) {
                    image(background5, 0, 0);
                }
                if (health > 100) {
                    image(background6, 0, 0);
                }
            }
            if (dayStart) {
                waveCounter++;
                image(handscreen, 450, 300);
                fill(255, 0, 0);
                textSize(100);
                text("Day " + wave, 400, 400);
                if (waveCounter == 90) {
                    dayStart = false;
                    waveCounter = 0;
                }
            }
            if (nightStart) {
                waveCounter++;
                image(glassbullethole, 300, 300);
                image(glassbullethole, 750, 300);
                fill(255, 0, 0);
                textSize(100);
                text("Night " + wave, 400, 400);
                if (waveCounter == 90) {
                    nightStart = false;
                    waveCounter = 0;
                }
            }

            //inventory/other useful info display for player
            fill(255);
            textSize(15);
            displayInventory(0, pistolInventory, 650, "1", pistolAmmo, 655);
            displayInventory(1, dualPistolInventory, 700, "2", dualpistolAmmo, 705);
            displayInventory(2, sniperInventory, 750, "2", sniperAmmo, 755);
            displayInventory(3, arInventory, 800, "3", arAmmo, 805);
            displayInventory(4, machineGunInventory, 850, "4", machinegunAmmo, 855);
            if (nadeBuy) {
                image(grenadeInventory, 900, 930);
                text("6", 905, 945);
                text(nadeCount, 905, 995);
            }
            image(knifeInventory, 950, 930);
            text("7", 955, 945);
            textSize(25);
            fill(0);
            text("Health: " + hp, 250, 25);
            text("Wall Health: " + health, 475, 25);
            text("Credits: " + credits, 750, 25);
            text("Zombies Killed: " + maxZombieKilled, 700, 925);

            //gun firing
            firecounter++;
            counter++;
            turretcounter++;
            if (gun == 0 && !grenade && !knife) {
                pistolAmmo = fireCounter(pistol, pistolAmmo, pistolDamage);
            } else if (gun == 1 && !grenade && !knife) {
                dualpistolAmmo = fireCounter(dualpistol, dualpistolAmmo, dualPistolDamage);
            } else if (gun == 2 && !grenade && !knife) {
                sniperAmmo = fireCounter(sniper, sniperAmmo, sniperDamage);
            } else if (gun == 3 && !grenade && !knife) {
                arAmmo = fireCounter(ar, arAmmo, arDamage);
            } else if (gun >= 4 && !grenade && !knife) {
                machinegunAmmo = fireCounter(machinegun, machinegunAmmo , machineGunDamage);
            } else if (grenade) {
                image(grenadeThrow, 50, py);
            } else if (knife) {
                image(noweapon, 50, py);
            }

            //trap/turret display
            if (trapNum == 1) {
                image(trap, 750, 100);
            }
            if (health == 0) {
                turret1 = false;
                turret2 = false;
                turret3 = false;
            }

            //turret shooting
            turretShoot(turret1, turret1FireRate, 150, 150, 0, 300, turret1Damage);
            turretShoot(turret2, turret2FireRate, 150, 450, 301, 600, turret2Damage);
            turretShoot(turret3, turret3FireRate, 150, 750, 601, 900, turret3Damage);

            //player movement
            if (up && py >= 10) {
                py = py - 10;
            }
            if (down && py + 80 <= height - 10) {
                py = py + 10;
            }

            //zombie spawning
            AddZombies(120, 1, 3, 2, 40 + (wave * 10), Zomb1, 60, 10, 0);
            AddZombies(110, 4, 4, 2, 50, zombPistol, 60, 0, 1);
            AddZombies(140, 5, 5, 2, 60, Zomb1, 60, 10, 0);
            AddZombies(80, 6, 6, 2, 50, zomb2Pistol, 60, 0, 2);
            AddZombies(80, 7, 8, 6, -20 + (wave * 10), Zomb2, 30, 5, 0);
            AddZombies(90, 9, 9, 6, 50, zombSniper, 30, 0, 3);
            AddZombies(90, 10, 10, 6, 100, Zomb2, 30, 5, 0);
            AddZombies(110, 11, 11, 6, 100, zombSniper, 30, 0, 3);
            AddZombies(110, 12, 12, 6, 110, zombAr, 30, 0, 4);
            AddZombies(90, 13, 14, 4, 110, Zomb3, 50, 25, 0);
            AddZombies(110, 15, 15, 4, 110, zombAr, 30, 0, 4);
            AddZombies(90, 16, 16, 4, 150, Zomb3, 50, 25, 0);
            AddZombies(100, 17, 17, 4, 150, zombAr, 50, 0, 4);
            AddZombies(110, 18, 18, 4, 100, zombHeavy, 30, 0, 5);
            AddZombies(100, 19, 19, 4, 200, Zomb3, 50, 25, 0);
            AddZombies(120, 20, 20, 4, 150, zombHeavy, 50, 0, 5);
            AddZombies(100, 21, 21, 4, 100, zombRocket, 50, 0, 6);
            AddZombies(90, 22, 22, 4, 200, zombSniper, 50, 0, 3);
            AddZombies(90, 23, 23, 4, 200, zombRocket, 50, 0, 6);
            AddZombies(90, 24, 24, 4, -40 + (wave * 10), Zomb3, 50, 25, 0);
            AddZombies(120, 25, 25, 4, -40 + (wave * 10), zombSniper, 50, 0, 3);
            AddZombies(110, 26, 26, 4, -40 + (wave * 10), zombAr, 50, 0, 4);
            AddZombies(90, 27, 27, 4, -40 + (wave * 10), zombHeavy, 50, 0, 5);
            AddZombies(100, 28, 50000, 4, -40 + (wave * 10), zombRocket, 50, 0, 6);

            //bullet image
            for (Blt blt : bltList) {
                fill(100, 20, 30);
                image(bullet, blt.x, blt.y);
                blt.move();
            }

            //zombie bullet image
            for (ZombBlt zombBlt : zombBltList) {
                fill(color(100, 20, 30));
                for (Zomb zomb : zombList) {
                    if (zomb.gun > 0 && zomb.gun < 6) {
                        image(zombBullet, zombBlt.x, zombBlt.y);
                    } else if (zomb.gun == 6) {
                        image(rocket, zombBlt.x, zombBlt.y);
                    }
                }
                zombBlt.move();
            }

            //bullet and zombie bullet collision
            for (Zomb zomb : zombList) {
                for (ZombBlt zombBlt : zombBltList) {
                    for (Blt blt : bltList) {
                        if (blt.zombBltCollision(zomb.gun, zombBlt.x, zombBlt.y)) {
                            zombBlt.health -= 1;
                            image(collide, zombBlt.x, zombBlt.y + 8);
                        }
                    }
                    bltList.removeIf(blt -> blt.zombBltCollision(zomb.gun, zombBlt.x, zombBlt.y));
                }
                zombBltList.removeIf(zombBlt -> zombBlt.health <= 0);
            }

            //knife movement and collision
            if (knifeCounter > 0) {
                image(spear, knifex, py + 50);
                knifex += 2;
                knifeCounter--;
            }
            for (Zomb zomb : zombList) {
                if (knife && knifeCounter == 3 && zomb.x < 280) {
                    if (zomb.knifeCollision(py)) {
                        zomb.health -= knifeDamage;
                    }
                }
            }

            //grenade explosion
            for (Grenade nade : nadeList) {
                fill(100, 20, 30);
                image(nade2, nade.x, nade.y);
                nade.move();
                if (nade.timer <= 0) {
                    image(explode, nade.x - nade.len, nade.y - nade.len);
                    for (Zomb zomb : zombList) {
                        if (nade.inNadeBound(zomb.x, zomb.y)) {
                            zomb.health -= nade.damage;
                        }
                    }
                }
            }
            nadeList.removeIf(grenade -> grenade.timer <= -10);

            for (Zomb zomb : zombList) {
                //zombie bullet collision
                for (ZombBlt zombBlt : zombBltList) {
                    if (zombBlt.hitPlayer(zomb.gun, py)) {
                        hp -= zombBlt.damage;
                    }
                    if (zombBlt.x < 240 && health != 0) {
                        health -= zombBlt.damage;
                    }
                }
                zombBltList.removeIf(zombBlt -> zombBlt.hitPlayer(zomb.gun, py));

                //bullet and zombie collision
                for (Blt blt : bltList) {
                    if (blt.zombCollision(zomb.x, zomb.y)) {
                        zomb.health -= blt.damage;
                    }
                }
                bltList.removeIf(blt -> blt.zombCollision(zomb.x, zomb.y));

                //zombie dying
                if (zomb.health <= 0) {
                    credits += 200;
                    zombKilled++;
                    maxZombieKilled++;
                }
            }
            zombBltList.removeIf(zombBlt -> zombBlt.x < 240 && health != 0);
            zombList.removeIf(zomb -> zomb.health <= 0);

            //ending the wave
            if (zombKilled == 5 + (wave * 5) && zombList.isEmpty()) {
                actualWave++;
                if (actualWave % 6 != 0) {
                    dayStart = true;
                    wave++;
                    shop = true;
                    main = true;
                } else {
                    nightStart = true;
                }
                zombNum = 5 + (wave * 5);
            }
        }
        if (shop) {
            if (main) {
                fill(225);
                image(storebackground, 0, 0);
                textSize(40);
                image(armour_image, 10, 185);
                image(ammo_image, 370, 370);
                text("Guns", 800, 450);
                text("Armour", 102, 480);
                text("Turrets/Traps", 33, 865);
                text("Ammo", 535, 560);
                text("Attachment", 750, 560);
                fill(255, 0, 0);
                rect(190, 900, 60, 40);
                fill(255);
                textSize(25);
                text("Continue?", 50, 930);
                text("Yes", 200, 930);
            }
            if (gunBuy) {
                background(gunStore);
                fill(255);
                if (maxGun == 0) {
                    gunOptions(dualpistol_image, "Dual pistols: ", 3000);
                } else if (maxGun == 1) {
                    gunOptions(sniper_image, "Sniper: ", 5000);
                } else if (maxGun == 2) {
                    gunOptions(ar_image, "AR: ", 10000);
                } else if (maxGun == 3) {
                    gunOptions(machinegun_image, "Machine Gun: ", 20000);
                }
                if (maxGun >= 4) {
                    image(soldOut, 310, 215);
                    text("Maxed Out", 400, 470);
                }
                if (!nadeBuy) {
                    image(lock, 80, 550);
                    text("Grenade Unlock: 1000", 80, 800);
                }
                if (nadeBuy) {
                    if (nadeUpgrade == 0) {
                        image(nadeGet, 130, 570);
                        text("Faulty Grenade: 1000", 80, 800);
                    } else if (nadeUpgrade == 1) {
                        image(nadeGet, 130, 570);
                        text("Stronger Grenade: 3000", 70, 800);
                    } else if (nadeUpgrade == 2) {
                        image(nadeGet, 130, 570);
                        text("Big Boom: 5000", 120, 800);
                    } else {
                        image(soldOut, 100, 520);
                        text("Maxed Out", 180, 800);
                    }
                }
                if (knifeUpgrade == 0) {
                    image(knifeGet, 575, 570);
                    text("Knife Upgrade 1: 2000", 550, 800);
                } else if (knifeUpgrade == 1) {
                    image(knifeGet, 575, 570);
                    text("Knife Upgrade 2: 4000", 550, 800);
                } else if (knifeUpgrade == 2) {
                    image(knifeGet, 575, 570);
                    text("Knife Upgrade 3: 6000", 550, 800);
                } else {
                    image(soldOut, 565, 540);
                    text("Maxed Out", 630, 800);
                }
            }
            if (ammoBuy) {
                background(ammoStore);
                ammoOptions(pistolBullet, 70, 270, 0, pistolAmmo, 25, 375, "Pistol", 70, 250, "200", 180, 415);
                ammoOptions(pistolBullet, 395, 270, 1, dualpistolAmmo, 347, 375, "Dual Pistol", 390, 250, "300", 505, 415);
                ammoOptions(sniperBullet, 720, 270, 2, sniperAmmo, 675, 375, "Sniper", 710, 250, "800", 830, 415);
                ammoOptions(arBullet, 70, 475, 3, arAmmo, 25, 600, "AR", 70, 472, "600", 180, 640);
                ammoOptions(heavyBullet, 395, 475, 4, machinegunAmmo, 347, 600, "Heavy", 390, 472, "500", 505, 640);
                if (nadeBuy) {
                    fill(255);
                    nadeGet.resize(200, 100);
                    image(nadeGet, 750, 485);
                    //image
                    textSize(15);
                    text("Current: " + nadeCount, 675, 600);
                    textSize(30);
                    text("Grenade Ammo", 710, 472);
                    text("1000", 830, 640);
                }
            }
            if (turretBuy) {
                background(turretStore);
                textSize(25);
                fill(255, 255, 0);
                turret.resize(270, 200);
                turretOptions(turret1, turret1Upgrade, 135, 260, 100, 240, 170, 490, 135, 125, 200, 460);
                turretOptions(turret2, turret2Upgrade, 605, 260, 565, 240, 640, 490, 590, 590, 665, 460);
                turretOptions(turret3, turret3Upgrade, 135, 570, 100, 540, 170, 795, 135, 120, 200, 795);
                fill(0, 0, 255);
                rect(580, 782, 120, 40);
                rect(700, 782, 210, 40);
                fill(255, 255, 0);
                if (trapNum < 1) {
                    image(trapShop, 595, 570);
                    text("Buy: 500", 590, 812);
                } else {
                    text("Maxed", 590, 812);
                }
                if (trapUpgrade == 0) {
                    image(trapShop, 595, 570);
                    text("Strength1: 1000", 710, 812);
                } else if (trapUpgrade == 1) {
                    image(trapShop, 595, 570);
                    text("Damage1: 1000", 710, 812);
                } else if (trapUpgrade == 2) {
                    image(trapShop, 595, 570);
                    text("Strength2: 2000", 710, 812);
                } else if (trapUpgrade == 3) {
                    image(trapShop, 595, 570);
                    text("Damage2: 2000", 710, 812);
                } else {
                    image(soldOut, 595, 540);
                    text("Maxed Out", 710, 812);
                }
                textSize(35);
                fill(255);
                text("Top Turret", 160, 245);
                text("Middle Turret", 610, 245);
                text("Bottom Turret", 140, 548);
                text("Traps", 670, 548);
            }
            if (attachBuy) {
                background(attachStore);
                if (maxGun >= 0) {
                    image(pistolAttach, 60, 205);
                }
                if (maxGun >= 1) {
                    image(dualPistolAttach, 60, 353);
                }
                if (maxGun >= 2) {
                    image(sniperAttach, 60, 493);
                }
                if (maxGun >= 3) {
                    image(arAttach, 60, 630);
                }
                if (maxGun >= 4) {
                    image(machineGunAttach, 60, 760);
                }
                fill(0, 0, 255);
                rect(280, 660, 600, 45);
                fill(255);
                if (pistolUpgrade) {
                    image(pistolNoUpgrade, 400, 300);
                    if (pistolChange >= 1) {
                        suppressorUpgrade.resize(150, 123);
                        image(suppressorUpgrade, 310, 280);
                    }
                    if (pistolChange >= 2) {
                        redDotUpgrade.resize(180, 120);
                        image(redDotUpgrade, 540, 240);
                    }
                    if (pistolChange >= 3) {
                        stockUpgrade2.resize(180, 120);
                        image(stockUpgrade2, 800, 320);
                    }
                    if (pistolChange == 0) {
                        text("Upgrade 1: Suppressor - 400", 300, 700);
                    } else if (pistolChange == 1) {
                        text("Upgrade 2: RedDot Scope- 1000", 300, 700);
                    } else if (pistolChange == 2) {
                        text("Upgrade 3: Automatic - 3000", 300, 700);
                    } else {
                        text("Maxed Out", 475, 700);
                    }
                }
                if (dualPistolUpgrade) {
                    image(dualPistolNoUpgrade, 400, 300);
                    if (dualPistolChange >= 1) {
                        suppressorUpgrade.resize(150, 123);
                        image(suppressorUpgrade, 750, 320);
                        image(suppressorUpgrade, 810, 390);
                    }
                    if (dualPistolChange >= 2) {
                        redDot2.resize(140, 100);
                        image(redDot2, 475, 260);
                        image(redDot2, 545, 330);
                    }
                    if (dualPistolChange >= 3) {
                        stockUpgrade.resize(180, 120);
                        image(stockUpgrade, 290, 330);
                        image(stockUpgrade, 345, 415);
                    }
                    if (dualPistolChange == 0) {
                        text("Upgrade 1: Suppressor - 500", 300, 700);
                    } else if (dualPistolChange == 1) {
                        text("Upgrade 2: RedDot Scope - 1500", 300, 700);
                    } else if (dualPistolChange == 2) {
                        text("Upgrade 3: Automatic - 5000", 300, 700);
                    } else {
                        text("Maxed Out", 475, 700);
                    }
                }
                if (sniperUpgrade) {
                    sniperNoUpgrade.resize(650, 450);
                    image(sniperNoUpgrade, 300, 270);
                    if (sniperChange >= 1) {
                        suppressorUpgrade.resize(150, 123);
                        image(suppressorUpgrade, 300, 420);
                    }
                    if (sniperChange >= 2) {
                        scopeUpgrade.resize(180, 120);
                        image(scopeUpgrade, 680, 360);
                    }
                    if (sniperChange == 0) {
                        text("Upgrade 1: Suppressor - 1000", 300, 700);
                    } else if (sniperChange == 1) {
                        text("Upgrade 2: 8x Scope - 2000", 300, 700);
                    } else {
                        text("Maxed Out", 475, 700);
                    }
                }
                if (arUpgrade) {
                    arNoUpgrade.resize(600, 400);
                    image(arNoUpgrade, 300, 300);
                    if (arChange >= 1) {
                        suppressorUpgrade.resize(150, 124);
                        image(suppressorUpgrade, 780, 400);
                    }
                    if (arChange >= 2) {
                        redDot2.resize(180, 120);
                        image(redDot2, 510, 360);
                    }
                    if (arChange == 0) {
                        text("Upgrade 1: Suppressor - 1500", 300, 700);
                    } else if (arChange == 1) {
                        text("Upgrade 2: RedDot Scope - 2500", 300, 700);
                    } else {
                        text("Maxed Out", 475, 700);
                    }
                }
                if (machineGunUpgrade) {
                    machineGunNoUpgrade.resize(600, 400);
                    image(machineGunNoUpgrade, 300, 300);
                    if (machineGunChange >= 1) {
                        suppressorUpgrade.resize(150, 124);
                        image(suppressorUpgrade, 790, 392);
                    }
                    if (machineGunChange >= 2) {
                        redDot2.resize(180, 120);
                        image(redDot2, 520, 330);
                    }
                    if (machineGunChange == 0) {
                        text("Upgrade 1: Suppressor - 2500", 300, 700);
                    } else if (machineGunChange == 1) {
                        text("Upgrade 2: RedDot Scope - 3500", 300, 700);
                    } else {
                        text("Maxed Out", 475, 700);
                    }
                }
            }
            if (armourBuy) {
                textSize(35);
                background(armourStore);
                text("Current Health: " + hp, 330, 210);
                if (hp < 100) {
                    image(health_image, 350, 230);
                    text("Health: 500", 355, 500);
                }
                if (hp < 200 && hp >= 100) {
                    image(armourShop, 350, 230);
                    text("Armour 1: 500", 355, 500);
                } else if (hp < 300 && hp >= 200) {
                    image(armourShop, 350, 230);
                    text("Armour 2: 1000", 355, 500);
                } else if (hp < 400 && hp >= 300) {
                    image(armourShop, 350, 230);
                    text("Armour 3: 2000", 355, 500);
                } else if (hp == 400) {
                    image(soldOut, 330, 210);
                    text("Maxed Out", 415, 500);
                }
                text("Wall Health: " + health, 355, 580);
                if (health < 100) {
                    image(health_image, 350, 585);
                    text("Health: 1000", 365, 850);
                }
                if (health < 400 && health >= 100) {
                    image(brick, 350, 585);
                    text("Health 1: 2000", 365, 850);
                } else if (health < 700 && health >= 400) {
                    image(brick, 350, 585);
                    text("Health 2: 3000", 355, 850);
                } else if (health < 1000 && health >= 700) {
                    image(brick, 350, 585);
                    text("Health 3: 4000", 355, 850);
                } else if (health == 1000) {
                    image(soldOut, 335, 565);
                    text("Maxed Out", 385, 850);
                }
            }
            textSize(35);
            text(credits, 870, 56);
            image(house, 50, 108);
            image(scope, 570, 110);
            image(hammer, 740, 103);
            image(armour, 910, 103);
            if (!main) {
                fill(255, 0, 0);
                rect(25, 900, 225, 55);
                textSize(35);
                fill(255);
                text("Back", 80, 940);
            }
            zombKilled = 0;
            bltList.clear();
            zombBltList.clear();
            nadeList.clear();
        }
        if (gameEnd) {
            image(endbackground, 0, 0);
            textSize(75);
            fill(255);
            text("You Lose!", 350, 300);
            textSize(25);
            text("The Zombies have gotten past you and killed everyone!", 150, 400);
            text("You lasted for " + (wave-1) + " days.", 375, 450);
            text("Restart?", 250, 550);
            text("Yes", 400, 550);
            text("No", 550, 550);
        }
    }

    public void mouseReleased() {
        if ((!startScreen && !shop && !gameEnd && !load && !start2Screen) && hp > 0) {
            if ((pistolAmmo > 0 && !automaticPistol && gun == 0) || (dualpistolAmmo > 0 && !automaticDualPistol && gun == 1) || (sniperAmmo > 0 && gun == 2)) {
                if (fire && !grenade && !knife) {
                    bltList.add(new Blt((float) 100, py + 30, (float) 5, 0, damage));
                    if (gun == 0) {
                        pistolAmmo--;
                    } else if (gun == 1) {
                        dualpistolAmmo--;
                    } else {
                        sniperAmmo--;
                    }
                    fire = false;
                }
            }
            if (grenade) {
                float xspd = speedCalc(mouseX, 50);
                float yspd = speedCalc(mouseY, py);
                nadeList.add(new Grenade((float) 50, py, 200, xspd, yspd, nadeDamage, mouseX, mouseY, 100));
                nadeCount--;
                grenade = false;
            }
            if (knife && knifeCounter == 0) {
                knifeCounter = 30;
                knifex = 50;
            }
        }
        if (startScreen) {
            if (mouseX >= 200 && mouseX <= 240 && mouseY >= 750 && mouseY <= 800) {
                load = true;
                startScreen = false;
            }
            if (mouseX >= 350 && mouseX <= 390 && mouseY >= 750 && mouseY <= 800) {
                exit();
            }
        }
        if (start2Screen) {
            if (mouseX >= 200 && mouseX <= 240 && mouseY >= 750 && mouseY <= 800) {
                dayStart = true;
                start2Screen = false;
            }
            if (mouseX >= 350 && mouseX <= 390 && mouseY >= 750 && mouseY <= 800) {
                exit();
            }
        }
        if (shop) {
            changeMenu(167, 337, 105, 160, 345, 988, 185, 513, true, false, false, false, false, false);
            changeMenu(340, 512, 105, 160, 460, 725, 519, 887, false, true, false, false, false, false);
            changeMenu(865, 1000, 105, 160, 10, 340, 185, 513, false, false, true, false, false, false);
            changeMenu(690, 862, 105, 160, 13, 445, 519, 883, false, false, false, true, false, false);
            changeMenu(515, 687, 105, 160, 739, 980, 519, 885, false, false, false, false, true, false);
            if ((mouseX >= 25 && mouseX <= 250 && mouseY >= 900 && mouseY <= 955) || (mouseX >= 0 && mouseX <= 163 && mouseY >= 105 && mouseY <= 160)) {
                main = true;
                ammoBuy = false;
                armourBuy = false;
                turretBuy = false;
                attachBuy = false;
                gunBuy = false;
            }
            if (main) {
                if (mouseX >= 200 && mouseX <= 240 && mouseY >= 870 && mouseY <= 930) {
                    shop = false;
                    counter = 0;
                    gun = maxGun;
                    firecounter = 0;
                }
            }
            if (gunBuy) {
                if (maxGun == 0) {
                    gunPrice = 3000;
                } else if (maxGun == 1) {
                    gunPrice = 5000;
                } else if (maxGun == 2) {
                    gunPrice = 10000;
                } else if (maxGun == 3) {
                    gunPrice = 20000;
                }
                if (maxGun < 4) {
                    if (mouseX <= 700 && mouseX >= 300 && mouseY >= 245 && mouseY <= 435 && credits >= gunPrice) {
                        maxGun++;
                        credits -= gunPrice;
                    }
                }
                if (mouseX >= 115 && mouseX <= 420 && mouseY >= 570 && mouseY <= 760) {
                    if (!nadeBuy && credits >= 1000) {
                        nadeCount += 5;
                        nadeBuy = true;
                        credits -= 1000;
                        nadeDamage = 100;
                        nadeUpgrade++;
                    }
                    if (nadeBuy) {
                        if (nadeUpgrade == 1 && credits >= 3000) {
                            nadeDamage = 200;
                            credits -= 3000;
                            nadeUpgrade++;
                        } else if (nadeUpgrade == 2 && credits >= 5000) {
                            nadeDamage = 300;
                            credits -= 5000;
                            nadeUpgrade++;
                        }
                    }
                }
                if (mouseX >= 575 && mouseX <= 885 && mouseY >= 570 && mouseY <= 770) {
                    if (knifeUpgrade == 0) {
                        if (credits >= 2000) {
                            credits -= 2000;
                            knifeUpgrade++;
                            knifeDamage = 100;
                        }
                    } else if (knifeUpgrade == 1) {
                        if (credits >= 4000) {
                            credits -= 4000;
                            knifeUpgrade++;
                            knifeDamage = 150;
                        }
                    } else if (knifeUpgrade == 2) {
                        if (credits >= 6000) {
                            credits -= 6000;
                            knifeUpgrade++;
                            knifeDamage = 200;
                        }
                    }
                }
            }
            if (ammoBuy) {
                pistolAmmo = ammoGet(0, 20, 340, 380, 430, 200, pistolAmmo, 50);
                dualpistolAmmo = ammoGet(1, 345, 660, 385, 430, 300, dualpistolAmmo, 50);
                sniperAmmo = ammoGet(2, 670, 980, 385, 430, 800, sniperAmmo, 20);
                arAmmo = ammoGet(3, 20, 340, 600, 650, 600, arAmmo, 50);
                machinegunAmmo = ammoGet(4, 345, 660, 600, 650, 500, machinegunAmmo, 50);
                if (nadeBuy) {
                    if ((mouseX >= 670 && mouseX <= 980 && mouseY >= 600 && mouseY <= 650) && credits >= 1000) {
                        nadeCount += 5;
                        credits -= 1000;
                    }
                }
            }
            if (turretBuy) {
                if (mouseX >= 115 && mouseX <= 425 && mouseY >= 250 && mouseY <= 460) {
                    if (!turret1 && credits >= 2500) {
                        turret1 = true;
                        credits -= 2500;
                    } else if (turret1Upgrade < 4) {
                        if (turret1 && turret1Upgrade == 0 && credits >= 2000) {
                            turret1Damage = 100;
                            credits -= 2000;
                            turret1Upgrade++;
                        } else if (turret1 && turret1Upgrade == 1 && credits >= 2000) {
                            turret1FireRate = 60;
                            credits -= 2000;
                            turret1Upgrade++;
                        } else if (turret1 && turret1Upgrade == 2 && credits >= 5000) {
                            turret1Damage = 150;
                            credits -= 5000;
                            turret1Upgrade++;
                        } else if (turret1 && turret1Upgrade == 3 && credits >= 5000) {
                            turret1FireRate = 40;
                            credits -= 5000;
                            turret1Upgrade++;
                        }
                    }
                }
                if (mouseX >= 580 && mouseX <= 885 && mouseY >= 250 && mouseY <= 460) {
                    if (!turret2 && credits >= 2500) {
                        turret2 = true;
                        credits -= 2500;
                    } else if (turret2Upgrade < 4) {
                        if (turret2 && turret2Upgrade == 0 && credits >= 2000) {
                            turret2Damage = 100;
                            credits -= 2000;
                            turret2Upgrade++;
                        } else if (turret2 && turret2Upgrade == 1 && credits >= 2000) {
                            turret2FireRate = 60;
                            credits -= 2000;
                            turret2Upgrade++;
                        } else if (turret2 && turret2Upgrade == 2 && credits >= 5000) {
                            turret2Damage = 150;
                            credits -= 5000;
                            turret2Upgrade++;
                        } else if (turret2 && turret2Upgrade == 3 && credits >= 5000) {
                            turret2FireRate = 40;
                            credits -= 5000;
                            turret2Upgrade++;
                        }
                    }
                }
                if (mouseX >= 115 && mouseX <= 425 && mouseY >= 560 && mouseY <= 765) {
                    if (!turret3 && credits >= 2500) {
                        turret3 = true;
                        credits -= 2500;
                    } else if (turret3Upgrade < 4) {
                        if (turret3 && turret3Upgrade == 0 && credits >= 2000) {
                            turret3Damage = 100;
                            credits -= 2000;
                            turret3Upgrade++;
                        } else if (turret3 && turret3Upgrade == 1 && credits >= 2000) {
                            turret3FireRate = 60;
                            credits -= 2000;
                            turret3Upgrade++;
                        } else if (turret3 && turret3Upgrade == 2 && credits >= 5000) {
                            turret3Damage = 150;
                            credits -= 5000;
                            turret3Upgrade++;
                        } else if (turret3 && turret3Upgrade == 3 && credits >= 5000) {
                            turret3FireRate = 40;
                            credits -= 5000;
                            turret3Upgrade++;
                        }
                    }
                }
                if (mouseX >= 500 && mouseX < 700 && mouseY >= 782 && mouseY <= 822) {
                    if (trapNum < 1 && credits >= 500) {
                        trapNum++;
                        if (trapUpgrade < 1) {
                            trapDurability = 5;
                        } else if (trapUpgrade < 2) {
                            trapDurability = 10;
                        } else {
                            trapDurability = 20;
                        }
                        credits -= 500;
                    }
                }
                if (mouseX > 700 && mouseX <= 910 && mouseY >= 782 && mouseY <= 822) {
                    if (trapUpgrade < 4) {
                        if (trapUpgrade == 0 && credits >= 1000) {
                            trapDurability = 10;
                            credits -= 1000;
                            trapUpgrade++;
                        } else if (trapUpgrade == 1 && credits >= 1000) {
                            trapDamage = 100;
                            credits -= 1000;
                            trapUpgrade++;
                        } else if (trapUpgrade == 2 && credits >= 2000) {
                            trapDurability = 20;
                            credits -= 2000;
                            trapUpgrade++;
                        } else if (trapUpgrade == 3 && credits >= 2000) {
                            trapDamage = 200;
                            credits -= 2000;
                            trapUpgrade++;
                        }
                    }
                }
            }
            if (attachBuy) {
                changeAttachMenu(0, 205, 301, true, false, false, false, false);
                changeAttachMenu(1, 353, 449, false, true, false, false, false);
                changeAttachMenu(2, 493, 589, false, false, true, false, false);
                changeAttachMenu(3, 630, 726, false, false, false, true, false);
                changeAttachMenu(4, 760, 856, false, false, false, false, true);
                if (mouseX >= 280 && mouseX <= 880 && mouseY >= 660 && mouseY <= 705) {
                    if (pistolUpgrade && pistolChange < 3) {
                        if (pistolChange == 0 && credits >= 400) {
                            pistolFireRate = 30;
                            credits -= 400;
                            pistolChange++;
                        } else if (pistolChange == 1 && credits >= 1000) {
                            pistolDamage = 100;
                            credits -= 1000;
                            pistolChange++;
                        } else if (pistolChange == 2 && credits >= 3000) {
                            automaticPistol = true;
                            credits -= 3000;
                            pistolChange++;
                        }
                    }
                    if (dualPistolUpgrade && dualPistolChange < 3) {
                        if (dualPistolChange == 0 && credits >= 500) {
                            dualPistolFireRate = 25;
                            credits -= 500;
                            dualPistolChange++;
                        } else if (dualPistolChange == 1 && credits >= 1500) {
                            dualPistolDamage = 100;
                            credits -= 1500;
                            dualPistolChange++;
                        } else if (dualPistolChange == 2 && credits >= 5000) {
                            automaticDualPistol = true;
                            credits -= 5000;
                            dualPistolChange++;
                        }
                    }
                    if (sniperUpgrade && sniperChange < 2) {
                        if (sniperChange == 0 && credits >= 1000) {
                            sniperFireRate = 65;
                            credits -= 1000;
                            sniperChange++;
                        } else if (sniperChange == 1 && credits >= 2000) {
                            sniperDamage = 500;
                            credits -= 2000;
                            sniperChange++;
                        }
                    }
                    if (arUpgrade && arChange < 2) {
                        if (arChange == 0 && credits >= 1500) {
                            arFireRate = 12;
                            credits -= 1500;
                            arChange++;
                        } else if (arChange == 1 && credits >= 2500) {
                            arDamage = 80;
                            credits -= 2500;
                            arChange++;
                        }
                    }
                    if (machineGunUpgrade && machineGunChange < 2) {
                        if (machineGunChange == 0 && credits >= 2500) {
                            machineGunFireRate = 7;
                            credits -= 2500;
                            machineGunChange++;
                        } else if (machineGunChange == 1 && credits >= 3500) {
                            machineGunDamage = 65;
                            credits -= 3500;
                            machineGunChange++;
                        }
                    }
                }
            }
            if (armourBuy) {
                if (mouseX >= 350 && mouseX <= 645 && mouseY >= 225 && mouseY <= 455) {
                    if (hp < 100 && credits >= 500) {
                        hp = 100;
                        credits -= 500;
                    } else if (hp < 200 && hp >= 100 && credits >= 500) {
                        hp = 200;
                        credits -= 500;
                    } else if (hp < 300 && hp >= 200 && credits >= 1000) {
                        hp = 300;
                        credits -= 1000;
                    } else if (hp < 400 && hp >= 300 && credits >= 2000) {
                        hp = 400;
                        credits -= 2000;
                    }
                }
                if (mouseX >= 350 && mouseX <= 645 && mouseY >= 585 && mouseY <= 790) {
                    if (health < 100 && credits >= 1000) {
                        health = 100;
                        credits -= 1000;
                    } else if (health < 400 && health >= 100 && credits >= 2000) {
                        health = 400;
                        credits -= 2000;
                    } else if (health < 700 && health >= 400 && credits >= 3000) {
                        health = 700;
                        credits -= 3000;
                    } else if (health < 1000 && health >= 585 && credits >= 4000) {
                        health = 1000;
                        credits -= 4000;
                    }
                }
            }
        }
        if (gameEnd) {
            if (mouseX >= 400 && mouseX <= 440 && mouseY >= 500 && mouseY <= 550) {
                zombList.clear();
                bltList.clear();
                zombBltList.clear();
                nadeList.clear();
                hp = 100;
                py = 500;
                health = 100;
                credits = 0;
                zombKilled = 0;
                maxZombieKilled = 0;
                wave = 1;
                maxGun = 0;
                gun = 0;
                damage = 50;
                gunPrice = 3000;
                actualWave = 1;
                waveCounter = 0;
                firecounter = 0;
                counter = 0;
                turret1 = false;
                turret2 = false;
                turret3 = false;
                turret1Upgrade = 0;
                turret2Upgrade = 0;
                turret3Upgrade = 0;
                turret1Damage = 50;
                turret2Damage = 50;
                turret3Damage = 50;
                turret1FireRate = 70;
                turret2FireRate = 70;
                turret3FireRate = 70;
                trapUpgrade = 0;
                trapDurability = 5;
                trapDamage = 50;
                turretcounter = 0;
                trapNum = 0;
                grenade = false;
                nadeCount = 0;
                nadeUpgrade = 0;
                nadeDamage = 50;
                pistolDamage = 50;
                dualPistolDamage = 50;
                sniperDamage = 300;
                arDamage = 45;
                machineGunDamage = 40;
                pistolFireRate = 60;
                dualPistolFireRate = 40;
                sniperFireRate = 80;
                arFireRate = 20;
                machineGunFireRate = 12;
                fireRate = pistolFireRate;
                automaticPistol = false;
                automaticDualPistol = false;
                pistolAmmo = 80;
                dualpistolAmmo = 50;
                pistolChange = 0;
                dualPistolChange = 0;
                sniperChange = 0;
                arChange = 0;
                machineGunChange = 0;
                sniperAmmo = 15;
                arAmmo = 60;
                machinegunAmmo = 40;
                currAmmo = pistolAmmo;
                zombNum = 5 + (wave * 5);
                pistolUpgrade = true;
                dualPistolUpgrade = false;
                sniperUpgrade = false;
                arUpgrade = false;
                machineGunUpgrade = false;
                knife = false;
                knifeUpgrade = 0;
                knifeDamage = 50;
                start2Screen = true;
                gameEnd = false;
            }
            if (mouseX >= 550 && mouseX <= 590 && mouseY >= 500 && mouseY <= 550) {
                exit();
            }
        }
    }

    public void keyPressed() {
        if (key == 'w') {
            up = true;
        }
        if (key == 's') {
            down = true;
        }
        if (key == '1' && maxGun >= 0) {
            gun = 0;
            currAmmo = pistolAmmo;
            fireRate = pistolFireRate;
            firecounter = 0;
            grenade = false;
            knife = false;
        } else if (key == '2' && maxGun >= 1) {
            gun = 1;
            currAmmo = dualpistolAmmo;
            fireRate = dualPistolFireRate;
            firecounter = 0;
            grenade = false;
            knife = false;
        } else if (key == '3' && maxGun >= 2) {
            gun = 2;
            currAmmo = sniperAmmo;
            fireRate = sniperFireRate;
            firecounter = 0;
            grenade = false;
            knife = false;
        } else if (key == '4' && maxGun >= 3) {
            gun = 3;
            currAmmo = arAmmo;
            fireRate = arFireRate;
            firecounter = 0;
            grenade = false;
            knife = false;
        } else if (key == '5' && maxGun >= 4) {
            gun = 4;
            currAmmo = machinegunAmmo;
            fireRate = machineGunFireRate;
            firecounter = 0;
            grenade = false;
            knife = false;
        } else if (key == '6' && nadeCount > 0) {
            grenade = true;
            knife = false;
        } else if (key == '7') {
            knife = true;
            grenade = false;
        }
    }

    public void keyReleased() {
        if (key == 'w') {
            up = false;
        }
        if (key == 's') {
            down = false;
        }
    }

    public PImage imageSetter(String imageName, int resizeW, int resizeH) {
        PImage image = loadImage(imageName);
        image.resize(resizeW, resizeH);
        return image;
    }

    public void displayInventory(int gun, PImage inventory, int gunX, String gunNum, int ammo, int ammoX) {
        if (maxGun >= gun) {
            image(inventory, gunX, 930);
            text(gunNum, ammoX, 945);
            text(ammo, ammoX, 995);
        }
    }

    public int fireCounter(PImage image, int ammo, int damage) {
        if (hp > 0) {
            image(image, 50, py);
            if (ammo > 0) {
                if (firecounter % fireRate == 0 && !grenade && !knife) {
                    fire = true;
                    if (gun >= 3 || (automaticPistol && gun == 0) || (automaticDualPistol && gun == 1)) {
                        if (mousePressed) {
                            bltList.add(new Blt((float) 100, py + 30, (float) 5, 0, damage));
                            ammo--;
                            fire = false;
                        }
                    }
                }
            }
        }
        return ammo;
    }

    public void turretShoot(boolean turretNum, int turretFireRate, int turretX, int turretY, int minHeight, int maxHeight, int damage) {
        boolean turretBullet = false;
        if (hp > 0) {
            if (turretNum) {
                turret.resize(100, 100);
                image(turret, turretX, turretY);
                for (Zomb zomb : zombList) {
                    if (!turretBullet) {
                        if (zomb.y >= minHeight && zomb.y <= maxHeight) {
                            turretShootx = speedCalc(zomb.x, turretX + 100);
                            turretShooty = speedCalc(zomb.y, turretY + 10);
                            if (turretcounter % turretFireRate == 0) {
                                bltList.add(new Blt(turretX + 100, turretY + 10, turretShootx, turretShooty, damage));
                                turretcounter = 0;
                                turretBullet = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void AddZombies(int spawnRate, int startWave, int endWave, int speed, int healthZomb, PImage typeOfZomb, int damageRate, int damage, int gun) {
        if (actualWave >= startWave && actualWave <= endWave) {
            if (counter % spawnRate == 0 && zombNum > 0) {
                zombList.add(new Zomb((float) 900, setRandomPosition(), (float) speed, healthZomb, gun));
                zombNum--;
            }
            for (Zomb zomb : zombList) {
                fill(180);
                image(typeOfZomb, zomb.x, zomb.y);
                zomb.move();
                if (zomb.x < 250 && health != 0) {
                    zomb.x = 250;
                    if (counter % damageRate == 0) {
                        health -= damage;
                    }
                }
                if (trapNum > 0) {
                    if (800 >= zomb.y && 100 <= zomb.y + 80 && zomb.x == 800) {
                        zomb.health -= trapDamage;
                        trapDurability--;
                        if (trapDurability == 0) {
                            trapNum--;
                        }
                    }
                }
                zomb.fireCounter++;
                zombGunBarrier(1, 150, 600, 5);
                zombGunBarrier(2, 100, 600, 10);
                zombGunBarrier(3, 200, 800, 40);
                zombGunBarrier(4, 85, 700, 8);
                zombGunBarrier(5, 65, 400, 6);
                zombGunBarrier(6, 150, 500, 80);
                healthBarrier(zomb.x);
            }
        }
    }

    public void zombGunBarrier(int gun, int fireRate, int xPos, int damage) {
        for (Zomb zomb : zombList) {
            if (zomb.gun == gun) {
                zomb.fireCounter++;
                if (zomb.x < xPos - zomb.xBarrier) {
                    zomb.x = xPos - zomb.xBarrier;
                    if (zomb.fireCounter % fireRate == 0) {
                        zombBltList.add(new ZombBlt(zomb.x, zomb.y + 15, (float) -5, damage, 1));
                        if (health == 0) {
                            zomb.xBarrier += 125;
                        }
                        if (hp == 0) {
                            zomb.xBarrier += 1000;
                        }
                    }
                }
            }
        }
    }

    public void healthBarrier(float x) {
        if (health <= 0) {
            health = 0;
        }
        if (x + 75 < 0) {
            gameEnd = true;
        }
    }

    public float setRandomPosition() {
        return (float) (Math.random() * 600 + 100);
    }

    public void ammoOptions(PImage image, int imagex, int imagey, int gun, int ammo, int currx, int curry, String gunName, int ammoX, int ammoY, String cost, int costX, int costY) {
        if (maxGun >= gun) {
            image(image, imagex, imagey);
            fill(255);
            textSize(15);
            text("Current: " + ammo, currx, curry);
            textSize(30);
            text(gunName + " Ammo", ammoX, ammoY);
            text(cost, costX, costY);
        }
    }

    public int ammoGet(int gun, int x, int x2, int y, int y2, int creditNum, int ammo, int ammoNum) {
        if (maxGun >= gun) {
            if ((mouseX >= x && mouseX <= x2 && mouseY >= y && mouseY <= y2) && credits >= creditNum) {
                ammo += ammoNum;
                credits -= creditNum;
            }
        }
        return ammo;
    }

    public void gunOptions(PImage image, String gunName, int cost) {
        image(image, 305, 240);
        text(gunName + cost, 330, 470);
    }

    public void turretOptions(boolean turretNum, int turretUpgrade, int imagex, int imagey, int soldx, int soldy, int repairX, int repairY, int bulletX, int fireRateX, int maxX, int maxY) {
        if (!turretNum) {
            image(turret, imagex, imagey);
            text("Repair: 2500", repairX, repairY);
        }
        if (turretNum && turretUpgrade == 0) {
            image(turret, imagex, imagey);
            text("Upgrade Bullet1: 2000", bulletX, repairY);
        } else if (turret1 && turretUpgrade == 1) {
            image(turret, imagex, imagey);
            text("Upgrade FireRate1: 2000", fireRateX, repairY);
        } else if (turret1 && turretUpgrade == 2) {
            image(turret, imagex, imagey);
            text("Upgrade Bullet2: 5000", bulletX, repairY);
        } else if (turret1 && turretUpgrade == 3) {
            image(turret, imagex, imagey);
            text("Upgrade FireRate2: 5000", fireRateX, repairY);
        } else if (turret1 && turretUpgrade == 4) {
            image(soldOut, soldx, soldy);
            text("Maxed Out", maxX, maxY);
        }
    }

    public void changeMenu(int x, int x2, int y, int y2, int mainx, int mainx2, int mainy, int mainy2, boolean gunMenu, boolean ammoMenu, boolean armourMenu, boolean turretMenu, boolean attachMenu, boolean mainMenu) {
        if ((mouseX >= x && mouseX <= x2 && mouseY >= y && mouseY <= y2) || (main && (mouseX >= mainx && mouseX <= mainx2 && mouseY >= mainy && mouseY <= mainy2))) {
            gunBuy = gunMenu;
            ammoBuy = ammoMenu;
            armourBuy = armourMenu;
            turretBuy = turretMenu;
            attachBuy = attachMenu;
            main = mainMenu;
        }
    }

    public void changeAttachMenu(int gun, int y, int y2, boolean pistolMenu, boolean dualPistolMenu, boolean sniperMenu, boolean arMenu, boolean machineGunMenu) {
        if (maxGun >= gun) {
            if (mouseX >= 60 && mouseX <= 230 && mouseY >= y && mouseY <= y2) {
                pistolUpgrade = pistolMenu;
                dualPistolUpgrade = dualPistolMenu;
                sniperUpgrade = sniperMenu;
                arUpgrade = arMenu;
                machineGunUpgrade = machineGunMenu;
            }
        }
    }

    public static float speedCalc(float mloc, float ploc) {
        float change = mloc - ploc;
        return change / 40;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}